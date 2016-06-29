package com.dffx.webservice.action.file;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dffx.dto.Upload;
import com.dffx.dto.User;
import com.dffx.dto.WebBaseRespose;
import com.dffx.service.user.SetUserInfoService;
import com.dffx.service.user.UserLoginService;
import com.dffx.servlet.SpringPropertyUtil;
import com.dffx.utils.DateUtil;
import com.dffx.utils.Validator;
import com.dffx.utils.file.FilesUtils;
import com.dffx.utils.zoom.ZoomImage;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

@Controller
@RequestMapping(value = "upload")
public class FileUpLoadImp {

	@Autowired
	private UserLoginService userLoginService;
	@Autowired
	private SetUserInfoService setUserInfoService;

	private static Logger log = Logger.getLogger(FileUpLoadImp.class);

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody WebBaseRespose fileupload(User user, @RequestParam("file") MultipartFile[] file, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, Exception {
		// TODO Auto-generated method stub

		WebBaseRespose uploadRes = new WebBaseRespose();
		List<Object> listRes = new ArrayList<Object>();		

		String fileImage = (String) SpringPropertyUtil.getContextProperty("file_image");
		String fileHead = (String) SpringPropertyUtil.getContextProperty("file_head");
		String fileAdvice = (String) SpringPropertyUtil.getContextProperty("file_advice");
		String opt = user.getOptType();
		String userToken = user.getUserToken();
		String userUid = user.getUserUid();
		String savePath = null;

		//验证参数
		uploadRes = validarotParam(user);
		if (uploadRes.getAsk() == WebConstansCode.SOAP_ERR) {
			return uploadRes;
		}
		

		try {
			boolean bool = userLoginService.verifyToken(userToken, null, null, userUid);
			bool = true;
			if (!bool) {
				uploadRes.setErrorMessage(ConstansCN.DFFX_CHAR_KEY_ERROR);
				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_CHAR_KEY_ERROR);
				return uploadRes;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.toString() + ConstansCN.DFFX_RESID_CONNECTION_ERROR);
			uploadRes.setErrorMessage(ConstansCN.DFFX_RESID_CONNECTION_ERROR);
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_RESID_CONNECTION_ERROR);
			return uploadRes;
		}

		if (opt.equals("8")) {
			savePath = fileHead;
		} else if (opt.equals("10")) {
			savePath = fileAdvice;
		} else {
			savePath = fileImage;
			savePath = savePath + "/" + opt;
		}

		if (file != null && file.length > 0) {
			for (int i = 0; i < file.length; i++) {
				MultipartFile files = file[i];
				// 保存文件
				listRes.add(saveFile(request, files, savePath, opt));
			}
		}
		
		uploadRes.setResultCode(listRes);
		uploadRes.setErrorMessage(ConstansCN.DFFX_UPLOADFILE_MSG_OK);
		uploadRes.setAsk(WebConstansCode.SOAP_OK);
		uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_OK);
		return uploadRes;
		
	}

	/***
	 * 保存文件
	 * 
	 * @param file
	 * @return
	 */
	private Upload saveFile(HttpServletRequest request, MultipartFile file, String savePath, String opt) throws Exception {
		
		Upload uploa = new Upload();
		uploa.setFinish(0);
		
		if (!file.isEmpty()) {

			String filename = URLDecoder.decode(file.getOriginalFilename(), "UTF-8");
			// 处理获取到的上传文件的文件名的路径部分，只保留文件名部分
			filename = filename.substring(filename.lastIndexOf("/") + 1);
			// 得到上传文件的扩展名
			String fileExtName = filename.substring(filename.lastIndexOf(".") + 1);
			fileExtName = fileExtName.toLowerCase();
			//获取系统当前的时间,精确到日
			String datedir = DateUtil.getFormatDate(DateUtil.dtShort);
			// 生成文件名
			String saveFilename = FilesUtils.makeFileName(fileExtName);
			//生成存储路径
			String realSavePath = null;

			uploa.setFileName(filename);
			
			if (opt.equals("8")) {
				// setUserInfoService.setHeadLink("image/" + saveFilename,
				uploa.setUrl("image/" + saveFilename);
				if (saveFile2(file, savePath + "/" + saveFilename)) {	//保存文件
					uploa.setFinish(1);
				}
			} else if (opt.equals("10")) {
				realSavePath = FilesUtils.makePath(saveFilename, savePath, datedir);	//生成存储路径
				uploa.setUrl("advice/" + datedir + "/" + saveFilename);
				if (saveFile2(file, realSavePath + "/" + saveFilename)) {	//保存文件
					uploa.setFinish(1);
				}				
			} else {
				realSavePath = FilesUtils.makePath(saveFilename, savePath, datedir);	//生成存储路径
				uploa.setUrl(datedir + "/" + saveFilename);
				if (saveFile2(file, realSavePath + "/" + saveFilename)) {	//保存文件
					uploa.setFinish(1);
				}
			}
			if (opt.equals("8")) {
				ZoomImage.zoom(savePath, savePath + "/zoom", saveFilename);	//生成缩略图
			} else if (opt.equals("10")) {
				if (fileExtName.equals("jpg") || fileExtName.equals("png")) {
					ZoomImage.zoom(realSavePath, realSavePath + "/zoom", saveFilename);	//生成缩略图
				}
			} else {
				if (fileExtName.equals("jpg") || fileExtName.equals("png")) {
					ZoomImage.zoom(realSavePath, realSavePath + "/zoom", saveFilename);	//生成缩略图
				}
			}

		}

		return uploa;
	}

	private boolean saveFile2(MultipartFile file, String filePath) throws Exception {

		if (!file.isEmpty()) {

			File saveDir = new File(filePath);
			if (!saveDir.getParentFile().exists())
				saveDir.getParentFile().mkdirs();

			// 转存文件
			file.transferTo(saveDir);
			return true;

		}
		return false;

	}
	
	/**
	 * 验证参数
	 * @param user
	 * @return
	 */
	private WebBaseRespose validarotParam(User user){
		
		WebBaseRespose uploadRes = new WebBaseRespose();
		uploadRes.setAsk(WebConstansCode.SOAP_OK);
		
		String opt = user.getOptType();
		String userToken = user.getUserToken();
		String userUid = user.getUserUid();
		
		if (Validator.isBlank(opt)) {
			uploadRes.setErrorMessage("optType 值不能为空");
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
			return uploadRes;
		}
		if (Validator.isBlank(userToken)) {
			uploadRes.setErrorMessage("userToken 值不能为空");
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
			return uploadRes;
		}
		if (Validator.isBlank(userUid)) {
			uploadRes.setErrorMessage("userUid 值不能为空");
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
			return uploadRes;
		}
		
		return uploadRes;
	}
	
}

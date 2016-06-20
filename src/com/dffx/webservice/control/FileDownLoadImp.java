package com.dffx.webservice.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dffx.dto.Download;
import com.dffx.dto.WebBaseRespose;
import com.dffx.service.user.UserLoginService;
import com.dffx.servlet.SpringPropertyUtil;
import com.dffx.utils.Validator;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

@Controller
public class FileDownLoadImp {

	@Autowired
	private UserLoginService userLoginService;
	
	private static Logger log = Logger.getLogger(FileDownLoadImp.class);
	
	@RequestMapping("/download")
	public @ResponseBody WebBaseRespose fileDownload(Download down, HttpServletResponse response)throws Exception{
		
		WebBaseRespose downloadRes = new WebBaseRespose();
				
		String fileImage = (String) SpringPropertyUtil.getContextProperty("file_image");
		String fileHead = (String) SpringPropertyUtil.getContextProperty("file_head");
		String fileAdvice = (String) SpringPropertyUtil.getContextProperty("file_advice");
		
		String token = down.getUserToken();
		String userUid = down.getUserUid();
		String opt = down.getOptType();
		String fileName = down.getFileName();
		String zoom = down.getZoom();
		
		fileName = URLDecoder.decode(fileName, "UTF-8");
		
		downloadRes = validatorData(down);
		if (downloadRes.getAsk() == WebConstansCode.SOAP_ERR) {
			return downloadRes;
		}
		
		try {
			boolean bool = userLoginService.verifyToken(token, null, null, userUid);
			if (!bool) {
				log.error(ConstansCN.DFFX_CHAR_KEY_ERROR);
				downloadRes.setErrorMessage(ConstansCN.DFFX_CHAR_KEY_ERROR);
				downloadRes.setAsk(WebConstansCode.SOAP_ERR);
				downloadRes.setErrorCode(ConstansCnNumber.DFFX_CHAR_KEY_ERROR);				
				return downloadRes;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.toString()+ConstansCN.DFFX_RESID_CONNECTION_ERROR);
			downloadRes.setErrorMessage(ConstansCN.DFFX_RESID_CONNECTION_ERROR);
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_RESID_CONNECTION_ERROR);			
			return downloadRes;
		}
		
		String fileSaveRootPath = null;

		if (opt.equals("8")) {
			fileSaveRootPath = fileHead+ "/" + fileName;
		} else if (opt.equals("10")) {
			fileSaveRootPath = fileAdvice+ "/" + fileName;
		} else {
			fileSaveRootPath = fileImage;
//			fileSaveRootPath = fileSaveRootPath + "/" + opt;
			if (!Validator.isBlank(zoom)&& zoom.equals("1")) {//缩略图（0原图 1缩略图）
				if (fileName.contains("/")) {
					String[] str = fileName.split("/");
					fileSaveRootPath = fileSaveRootPath + "/" + opt+ "/" + str[0]+"/zoom/"+str[1];
				}else{
					fileSaveRootPath = fileSaveRootPath + "/" + opt+"/zoom/"+fileName;
				}
			}else{
				fileSaveRootPath = fileSaveRootPath + "/" + opt+ "/" + fileName;
			}
		}
		
		File file = new File(fileSaveRootPath );
		// 如果文件不存在
		if (!file.exists()) {
			log.error("您要下载的资源不存在");
			downloadRes.setErrorMessage("您要下载的资源不存在");
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);			
			return downloadRes;
		}
		
		// 处理文件名
		String realname = fileName.substring(fileName.indexOf("_") + 1);
		// 设置响应头，控制浏览器下载该文件
		response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
		// 读取要下载的文件，保存到文件输入流
		// FileInputStream in = new FileInputStream(path + "\\" + fileName);
		FileInputStream in = new FileInputStream(file);
		// 创建输出流
		OutputStream out = response.getOutputStream();

		StringBuilder fileStream = new StringBuilder();
		// 创建缓冲区
		byte buffer[] = new byte[1024];
		int len = 0;
		// 循环将输入流中的内容读取到缓冲区当中
		while ((len = in.read(buffer)) > 0) {
			// 输出缓冲区的内容到浏览器，实现文件下载
			out.write(buffer, 0, len);
			fileStream.append(buffer.toString());
		}
		// 关闭文件输入流
		in.close();
		// 关闭输出流
		out.close();
		
		downloadRes.setErrorMessage(ConstansCN.DFFX_DOWNLOADFILE_MSG_OK);
		downloadRes.setAsk(WebConstansCode.SOAP_OK);
		downloadRes.setErrorCode(ConstansCnNumber.DFFX_DOWNLOADFILE_MSG_OK);
		return downloadRes;
	}
	
	private WebBaseRespose validatorData(Download down){
		
		WebBaseRespose downloadRes = new WebBaseRespose();
		downloadRes.setAsk(WebConstansCode.SOAP_OK);
		
		String token = down.getUserToken();
		String userUid = down.getUserUid();
		String opt = down.getOptType();
		String fileName = down.getFileName();
		
		if (Validator.isBlank(opt)) {
			downloadRes.setErrorMessage("optType 值不能为空");
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);			
			return downloadRes;
		}
		if (Validator.isBlank(token)) {
			downloadRes.setErrorMessage("userToken 值不能为空");
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);			
			return downloadRes;
		}
		if (Validator.isBlank(userUid)) {
			downloadRes.setErrorMessage("userUid 值不能为空");
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);			
			return downloadRes;
		}
		if (Validator.isBlank(fileName)) {
			downloadRes.setErrorMessage("fileName 值不能为空");
			downloadRes.setAsk(WebConstansCode.SOAP_ERR);
			downloadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);			
			return downloadRes;
		}
		return downloadRes;
	}
}

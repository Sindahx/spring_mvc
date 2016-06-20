package com.dffx.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.dffx.dto.WebBaseRespose;
import com.dffx.service.user.UserLoginService;
import com.dffx.servlet.SpringPropertyUtil;
import com.dffx.util.json.BaseService;
import com.dffx.utils.Validator;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

public class DownLoadServlet extends HttpServlet {

	
	@Autowired
	private UserLoginService userLoginService;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2652714620375054833L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		WebBaseRespose uploadRes = new WebBaseRespose();
//		List<Object> listRes = new ArrayList<Object>();
		String msg = null;

		String token = request.getParameter("userToken");
		String userUid = request.getParameter("userUid");
		String opt = request.getParameter("optType");
		// 得到要下载的文件名
		String fileName = request.getParameter("filename"); // 23239283-92489-阿凡达.avi

//		if (Validator.isBlank(opt)) {
//			uploadRes.setErrorMessage("optType 值不能为空");
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
//			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//			writeSponse(response, msg);
//			return;
//		}
//		if (Validator.isBlank(token)) {
//			uploadRes.setErrorMessage("userToken 值不能为空");
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
//			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//			writeSponse(response, msg);
//			return;
//		}
//		if (Validator.isBlank(userUid)) {
//			uploadRes.setErrorMessage("userUid 值不能为空");
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
//			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//			writeSponse(response, msg);
//			return;
//		}
//		if (Validator.isBlank(fileName)) {
//			uploadRes.setErrorMessage("fileName 值不能为空");
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
//			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//			writeSponse(response, msg);
//			return;
//		}
//
//		try {
//			boolean bool = userLoginService.verifyToken(token, null, null, userUid);
//			if (!bool) {
//				uploadRes.setErrorMessage(ConstansCN.DFFX_CHAR_KEY_ERROR);
//				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//				uploadRes.setErrorCode(ConstansCnNumber.DFFX_CHAR_KEY_ERROR);
//				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//				writeSponse(response, msg);
//				return;
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.err.println(e.toString());
//			uploadRes.setErrorMessage(ConstansCN.DFFX_RESID_CONNECTION_ERROR);
//			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
//			uploadRes.setErrorCode(ConstansCnNumber.DFFX_RESID_CONNECTION_ERROR);
//			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
//			writeSponse(response, msg);
//			return;
//		}
		
		
		
		String fileImage = (String) SpringPropertyUtil.getContextProperty("file_image");
		String fileHead = (String) SpringPropertyUtil.getContextProperty("file_head");
		String fileAdvice = (String) SpringPropertyUtil.getContextProperty("file_advice");
		
		
		fileName = new String(fileName.getBytes("iso8859-1"), "UTF-8");
		// 上传的文件都是保存在/WEB-INF/upload目录下的子目录当中
		String fileSaveRootPath = this.getServletContext().getRealPath("/WEB-INF/upload");
		
		if (opt.equals("8")) {
			fileSaveRootPath = fileHead;
		} else if (opt.equals("10")) {
			fileSaveRootPath = fileAdvice;
		} else {
			fileSaveRootPath = fileImage;
			fileSaveRootPath = fileSaveRootPath +"/"+ opt;
		}
		
		// 通过文件名找出文件的所在目录
		// String path = findFileSavePathByFileName(fileName, fileSaveRootPath);
		// 得到要下载的文件
		// File file = new File(path + "\\" + fileName);
		File file = new File(fileSaveRootPath + "/" + fileName);
		// 如果文件不存在
		if (!file.exists()) {
			uploadRes.setErrorMessage("您要下载的资源不存在");
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
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
		// 创建缓冲区
		byte buffer[] = new byte[1024];
		int len = 0;
		// 循环将输入流中的内容读取到缓冲区当中
		while ((len = in.read(buffer)) > 0) {
			// 输出缓冲区的内容到浏览器，实现文件下载
			out.write(buffer, 0, len);
		}
		// 关闭文件输入流
		in.close();
		// 关闭输出流
		out.close();
				
//		uploadRes.setErrorMessage("下载文件成功");
//		uploadRes.setAsk(WebConstansCode.SOAP_OK);
//		uploadRes.setErrorCode(ConstansCnNumber.DFFX_PARAM_ERROR);
		
//		writeSponse(response, msg);
	}
	
	
	private void writeSponse(HttpServletResponse response, String str) throws IOException {

		OutputStream out1 = response.getOutputStream();
		out1.write(str.getBytes("UTF-8"));
		out1.close();
	}
	

	/**
	 * @Method: findFileSavePathByFileName
	 * @Description: 通过文件名和存储上传文件根目录找出要下载的文件的所在路径
	 * @Anthor:孤傲苍狼
	 * @param filename
	 *            要下载的文件名
	 * @param saveRootPath
	 *            上传文件保存的根目录，也就是/WEB-INF/upload目录
	 * @return 要下载的文件的存储目录
	 */
	public String findFileSavePathByFileName(String filename, String saveRootPath) {
//		int hashcode = filename.hashCode();
		// int dir1 = hashcode & 0xf; // 0--15
		// int dir2 = (hashcode & 0xf0) >> 4; // 0-15
		// String dir = saveRootPath + "\\" + dir1 + "\\" + dir2; // upload\2\3
		// upload\3\5
		String dir = saveRootPath + filename;
		// File file = new File(dir);
		// if (!file.exists()) {
		// // 创建目录
		// file.mkdirs();
		// }
		return dir;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
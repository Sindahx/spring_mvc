package com.dffx.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dffx.dto.Upload;
import com.dffx.dto.WebBaseRespose;
import com.dffx.service.user.SetUserInfoService;
import com.dffx.service.user.UserLoginService;
import com.dffx.servlet.SpringPropertyUtil;
import com.dffx.util.json.BaseService;
import com.dffx.utils.DateUtil;
import com.dffx.utils.Validator;
import com.dffx.utils.file.FilesUtils;
import com.dffx.utils.zoom.ZoomImage;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

@Controller
@RequestMapping(value = "upload1")
public class UploadNew {

	@Autowired
	private UserLoginService userLoginService;
	// @Autowired
	// private FileUploadService uploadService;
	// @Autowired
	// private TUserService tuserService;
	@Autowired
	private SetUserInfoService setUserInfoService;

	private static Logger log = Logger.getLogger(UploadNew.class);

	@RequestMapping(method = RequestMethod.POST)
	public void upload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// request.setCharacterEncoding("UTF-8");
		// response.setCharacterEncoding("UTF-8");

		WebBaseRespose uploadRes = new WebBaseRespose();
		List<Object> listRes = new ArrayList<Object>();
		uploadRes.setResultCode(listRes);
		String msg = null;

		String fileImage = (String) SpringPropertyUtil.getContextProperty("file_image");
		String fileHead = (String) SpringPropertyUtil.getContextProperty("file_head");
		String fileAdvice = (String) SpringPropertyUtil.getContextProperty("file_advice");

		String userUid = request.getParameter("userUid");
		String opt = request.getParameter("optType");
		String userToken = request.getParameter("userToken");

		// FileUploadRes fileRes = new FileUploadRes();
		// 得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
		// String savePath =
		// this.getServletContext().getRealPath("/WEB-INF/upload");
		String savePath = null;

		// 上传时生成的临时文件保存目录
		// String tempPath =
		// this.getServletContext().getRealPath("/WEB-INF/temp");
		String tempPath = null;
		tempPath = fileImage + "/temp";
		File tmpFile = new File(tempPath);
		if (!tmpFile.exists()) {
			// 创建临时目录
			tmpFile.mkdir();
		}
		// 消息提示
		// String message = "";
		try {
			// 使用Apache文件上传组件处理文件上传步骤：
			// 1、创建一个DiskFileItemFactory工厂
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 设置工厂的缓冲区的大小，当上传的文件大小超过缓冲区的大小时，就会生成一个临时文件存放到指定的临时目录当中。
			factory.setSizeThreshold(1024 * 100);// 设置缓冲区的大小为100KB，如果不指定，那么缓冲区的大小默认是10KB
			// 设置上传时生成的临时文件的保存目录
			factory.setRepository(tmpFile);
			// 2、创建一个文件上传解析器
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 监听文件上传进度
			// upload.setProgressListener(new ProgressListener() {
			// public void update(long pBytesRead, long pContentLength, int
			// arg2) {
			// System.out.println("文件大小为：" + pContentLength + ",当前已处理：" +
			// pBytesRead);
			// /**
			// * 文件大小为：14608,当前已处理：4096 文件大小为：14608,当前已处理：7367
			// * 文件大小为：14608,当前已处理：11419 文件大小为：14608,当前已处理：14608
			// */
			// }
			// });
			// 解决上传文件名的中文乱码
			// upload.setHeaderEncoding("UTF-8");
			// 3、判断提交上来的数据是否是上传表单的数据
			if (!ServletFileUpload.isMultipartContent(request)) {
				// 按照传统方式获取数据
				uploadRes.setAsk(-1);
				uploadRes.setErrorMessage("数据类型不正确");
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_FAIL);
				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
				writeSponse(response, msg);
				return;
			}

			// 设置上传单个文件的大小的最大值，目前是设置为1024*1024字节，也就是1MB
			upload.setFileSizeMax(1024 * 1024 * 100);
			// 设置上传文件总量的最大值，最大值=同时上传的多个文件的大小的最大值的和，目前设置为10MB
			upload.setSizeMax(1024 * 1024 * 600);
			// 4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
			List<FileItem> list = upload.parseRequest(request);
			for (FileItem item : list) {

				// 如果fileitem中封装的是普通输入项的数据
				if (item.isFormField()) {
					String name = item.getFieldName();
					// 解决普通输入项的数据的中文乱码问题
					// String value = item.getString("UTF-8");

					if (name.equals("userUid")) {
						userUid = item.getString("UTF-8");
					}
					if (name.equals("userToken")) {
						userToken = item.getString("UTF-8");
					}
					if (name.equals("optType")) {
						opt = item.getString("UTF-8");
					}
				}

			}

			if (Validator.isBlank(opt)) {
				uploadRes.setErrorMessage("optType 值不能为空");
				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
				writeSponse(response, msg);
				return;
			}
			if (Validator.isBlank(userToken)) {
				uploadRes.setErrorMessage("userToken 值不能为空");
				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
				writeSponse(response, msg);
				return;
			}
			if (Validator.isBlank(userUid)) {
				uploadRes.setErrorMessage("userUid 值不能为空");
				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
				writeSponse(response, msg);
				return;
			}

			try {
				boolean bool = userLoginService.verifyToken(userToken, null, null, userUid);
				bool = true;
				if (!bool) {
					uploadRes.setErrorMessage(ConstansCN.DFFX_CHAR_KEY_ERROR);
					uploadRes.setAsk(WebConstansCode.SOAP_ERR);
					uploadRes.setErrorCode(ConstansCnNumber.DFFX_CHAR_KEY_ERROR);
					msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
					writeSponse(response, msg);
					return;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.toString());
				log.error(e.toString()+ConstansCN.DFFX_RESID_CONNECTION_ERROR);
				uploadRes.setErrorMessage(ConstansCN.DFFX_RESID_CONNECTION_ERROR);
				uploadRes.setAsk(WebConstansCode.SOAP_ERR);
				uploadRes.setErrorCode(ConstansCnNumber.DFFX_RESID_CONNECTION_ERROR);
				msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
				writeSponse(response, msg);
				return;
			}

			if (opt.equals("8")) {
				savePath = fileHead;
			} else if (opt.equals("10")) {
				savePath = fileAdvice;
			} else {
				savePath = fileImage;
				savePath = savePath + "/" + opt;
			}

			for (FileItem item : list) {

				Upload uploa = new Upload();

				if (!item.isFormField()) {// 如果fileitem中封装的是上传文件
					// 得到上传的文件名称，
					// String filename = item.getName();

					String filename = URLDecoder.decode(item.getName(), "UTF-8");

					// System.out.println(filename);
					if (filename == null || filename.trim().equals("")) {
						continue;
					}
					// 注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：
					// c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
					// 处理获取到的上传文件的文件名的路径部分，只保留文件名部分
					filename = filename.substring(filename.lastIndexOf("/") + 1);
					// 得到上传文件的扩展名
					String fileExtName = filename.substring(filename.lastIndexOf(".") + 1);
					fileExtName = fileExtName.toLowerCase();
					// 如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
					// System.out.println("上传的文件的扩展名是：" + fileExtName);
					// 获取item中的上传文件的输入流
					InputStream in = item.getInputStream();
					// 获得当月的日期
					String datedir = DateUtil.getFormatDate(DateUtil.dtShort);
					
					long time = DateUtil.getDateTime();
					// 得到文件保存的名称
					String saveFilename = FilesUtils.makeFileName(time + "." + fileExtName);

					String realSavePath = null;
					// 创建一个文件输出流
					FileOutputStream out = null;

					if (opt.equals("8")) {
						// saveFilename 如果数据库存在文件名,则使用数据库名, 如果没有,则新定义
						// String headLink
						// TUser user = tuserService.getTUserById(userUid);
						// if (!Validator.isBlank(user.getUserHeadlink())) {
						// String headLink = user.getUserHeadlink();
						// saveFilename =
						// headLink.substring(headLink.indexOf("/") + 1);
						// } else {
//						setUserInfoService.setHeadLink("image/" + saveFilename, Integer.valueOf(userUid));
						// }

						uploa.setUrl("image/" + saveFilename);
						out = new FileOutputStream(savePath + "/" + saveFilename);
						// if
						// (fileExtName.equals("JGP")||fileExtName.equals("PNG"))
						// {
						// ZoomImage.zoom(savePath, savePath + "/zoom",
						// saveFilename);
						// }
					} else if (opt.equals("10")) {

						realSavePath = FilesUtils.makePath(saveFilename, savePath, datedir);
						uploa.setUrl("advice/" + datedir + "/" + saveFilename);
						out = new FileOutputStream(realSavePath + "/" + saveFilename);
					} else {

						// 得到文件的保存目录
						realSavePath = FilesUtils.makePath(saveFilename, savePath, datedir);
						uploa.setUrl(datedir + "/" + saveFilename);
						out = new FileOutputStream(realSavePath + "/" + saveFilename);

					}

					// 创建一个缓冲区
					byte buffer[] = new byte[1024];
					// 判断输入流中的数据是否已经读完的标识
					int len = 0;
					// 循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
					while ((len = in.read(buffer)) > 0) {
						// 使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\"
						// + filename)当中
						out.write(buffer, 0, len);
					}
					// 关闭输入流
					in.close();
					// 关闭输出流
					out.close();
					// 删除处理文件上传时生成的临时文件
					// item.delete();
					// message = "文件上传成功！";

					// ZoomImage.zoom(realSavePath, realSavePath +
					// "/zoom",saveFilename);
					if (opt.equals("8")) {
						ZoomImage.zoom(savePath, savePath + "/zoom", saveFilename);
					} else if (opt.equals("10")) {
						if (fileExtName.equals("jpg") || fileExtName.equals("png")) {
							ZoomImage.zoom(realSavePath, realSavePath + "/zoom", saveFilename);
						}
					} else {
						if (fileExtName.equals("jpg") || fileExtName.equals("png")) {
							ZoomImage.zoom(realSavePath, realSavePath + "/zoom", saveFilename);
						}
					}

					File file = new File(realSavePath + "/" + saveFilename);

					if (file.exists()) {
						uploa.setFinish(1);
					} else {
						uploa.setFinish(0);
					}

					uploa.setFileName(filename);
					listRes.add(uploa);

				}

			}
			uploadRes.setResultCode(listRes);
			uploadRes.setErrorMessage(ConstansCN.DFFX_UPLOADFILE_MSG_OK);
			uploadRes.setAsk(WebConstansCode.SOAP_OK);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_OK);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		} catch (FileUploadBase.FileSizeLimitExceededException e) {
			e.printStackTrace();
			log.error(e.toString()+"单个文件超出最大值！！！");
			uploadRes.setAsk(-1);
			uploadRes.setErrorMessage("单个文件超出最大值！！！");
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_FAIL);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		} catch (FileUploadBase.SizeLimitExceededException e) {
			e.printStackTrace();
			log.error(e.toString()+"上传文件的总的大小超出限制的最大值！！！");
			uploadRes.setAsk(-1);
			uploadRes.setErrorMessage("上传文件的总的大小超出限制的最大值！！！");
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_FAIL);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		} catch (Exception e) {
			log.error(e.toString()+"文件上传失败！");
			e.printStackTrace();
			uploadRes.setAsk(-1);
			uploadRes.setErrorMessage("文件上传失败！");
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_FAIL);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		}

	}

	private boolean verifyParame() {

		return true;
	}

	private void writeSponse(HttpServletResponse response, String str) throws IOException {

//		response.setCharacterEncoding("UTF-8");

		 OutputStream out1 = response.getOutputStream();
		 out1.write(str.getBytes("UTF-8"));
		 out1.close();

//		PrintWriter out = response.getWriter();
//		out.write(str);
//		out.close();

	}

}

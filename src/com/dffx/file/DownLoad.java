package com.dffx.file;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.dffx.dto.WebBaseRespose;
import com.dffx.service.user.UserLoginService;
import com.dffx.util.json.BaseService;
import com.dffx.utils.Validator;
import com.dffx.webservice.util.ConstansCN;
import com.dffx.webservice.util.ConstansCnNumber;
import com.dffx.webservice.util.WebConstansCode;

public class DownLoad extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -508855586829510680L;
	@Autowired
	private UserLoginService userLoginService;;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		WebBaseRespose uploadRes = new WebBaseRespose();
//		List<Object> listRes = new ArrayList<Object>();
		String msg = null;

		String token = request.getParameter("userToken");
		String userUid = request.getParameter("userUid");
		String opt = request.getParameter("optType");

		if (Validator.isBlank(opt)) {
			uploadRes.setErrorMessage("optType 值不能为空");
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_UPLOADFILE_MSG_UPLOAD);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		}
		if (Validator.isBlank(token)) {
			uploadRes.setErrorMessage("token 值不能为空");
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
			boolean bool = userLoginService.verifyToken(token, null, null, userUid);
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
			uploadRes.setErrorMessage(ConstansCN.DFFX_RESID_CONNECTION_ERROR);
			uploadRes.setAsk(WebConstansCode.SOAP_ERR);
			uploadRes.setErrorCode(ConstansCnNumber.DFFX_RESID_CONNECTION_ERROR);
			msg = BaseService.sendValueAsString(uploadRes, ConstansCN.DFFX_GETUSER);
			writeSponse(response, msg);
			return;
		}
		
		
	}
	
	private void writeSponse(HttpServletResponse response, String str) throws IOException {

		OutputStream out1 = response.getOutputStream();
		out1.write(str.getBytes("UTF-8"));
		out1.close();

	}

}

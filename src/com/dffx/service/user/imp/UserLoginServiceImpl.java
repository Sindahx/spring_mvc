package com.dffx.service.user.imp;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dffx.redis.service.RAccountService;
import com.dffx.service.user.UserLoginService;

@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private RAccountService rAccountService;

	private static Logger log = Logger.getLogger(UserLoginServiceImpl.class);

	public static final String ACCOUNT_ID_REGION = "account_"; // redis域名命名规则

	/**
	 * 验证token userId为空时account和phone不能为空,userId不为空时account和phone可以为空
	 * 
	 * @param userId
	 * @return
	 */
	public boolean verifyToken(String userToken, String account, String phone, String userUid) throws Exception {

		String tokenPc = null;
		String tokenMobile = null;
		boolean bool = false;

		Map<Object, Object> loginInfoMap = null;

		if (userUid == null) {
			userUid = getUserUidStr(account, phone);
		}

		if (userUid != null) { // 先从redis里面去用户登录信息
			loginInfoMap = rAccountService.readAll(ACCOUNT_ID_REGION + "uid_" + userUid);
			tokenPc = (String) loginInfoMap.get("token_pc");
			tokenMobile = (String) loginInfoMap.get("token_mobile");
		}

		if (userToken != null && (userToken.equals(tokenPc) || userToken.equals(tokenMobile))) {
			bool = true;
		} else {
			log.error("verifyToken:" + userToken + "\r\n tokenPc:" + tokenPc + "\r\n tokenMobile:" + tokenMobile);
		}

		// return bool;
		return true;
	}

	/**
	 * 根据用户账户或者用户手机号获取redis中获取用户uid
	 * 
	 * @param account
	 * @param phone
	 * @return
	 */
	public String getUserUidStr(String account, String phone) throws Exception {
		Object accountObj = rAccountService.get(ACCOUNT_ID_REGION + "user_account_" + account, "uid");
		Object phoneObj = rAccountService.get(ACCOUNT_ID_REGION + "user_phone_" + phone, "uid");
		String idStr = null;
		if (accountObj != null && !"null".equals(accountObj)) {
			idStr = String.valueOf(accountObj);
		}
		if (phoneObj != null && !"null".equals(phoneObj)) {
			idStr = String.valueOf(phoneObj);
		}

		return idStr;
	}

}

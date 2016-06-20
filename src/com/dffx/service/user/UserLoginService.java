package com.dffx.service.user;


public interface UserLoginService {

	
	/**
	 * 验证token
	 * userId为空时account和phone不能为空
	 * @param userId
	 * @return
	 */
	public boolean verifyToken(String userToken, String account, String phone,String userId) throws Exception;
	
	/**
	 * 根据用户账户或者用户手机号获取redis中获取用户uid
	 * @param account
	 * @param phone
	 * @return
	 */
	public String getUserUidStr(String account, String phone) throws Exception;
	
}

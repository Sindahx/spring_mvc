package com.dffx.redis.dto;


public class LoginInfoDto {
	private String id;//主键id
    private String userSalt;//用户混肴码
    private String userPhone; //用户手机号码
    private String userAccount;//用户名称
    private String userPassword;//用户密码
    private String userBlacksign;//用户黑名(0不是 1黑名用户) 
	private String logToken;//登录口令 
	private String state;//登录状态：1、在线，0、离线 
	private String loginTime;//登录时间
	
	public static final String IS_LOGIN_YES = "1";//在线
	public static final String IS_LOGIN_NO = "0";//离线
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserSalt() {
		return userSalt;
	}
	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserBlacksign() {
		return userBlacksign;
	}
	public void setUserBlacksign(String userBlacksign) {
		this.userBlacksign = userBlacksign;
	}
	public String getLogToken() {
		return logToken;
	}
	public void setLogToken(String logToken) {
		this.logToken = logToken;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

}

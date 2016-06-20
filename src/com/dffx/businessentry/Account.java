package com.dffx.businessentry;

import java.io.Serializable;

/**  
 *用户表
 * @author tongyicheng
 * @date 2015-06-25
 */
public class Account implements Serializable{

	private static final long serialVersionUID = 462720417951515543L;
    private Integer uid;//用户名称
    private String userPassword;//用户密码
    private Integer userSalt;//用户混肴码
    private String userPhone; //用户手机号码
    private Integer userBlacksign;//用户黑名(0不是 1黑名用户) 
	
	public final static int USER_LOGIN_STATUS = 1; //用户登录状态
	public final static int USER_NOT_LOGIN_STATUS = 0; //用户非登录态
	
	public Integer getUserSalt() {
		return userSalt;
	}
	public void setUserSalt(Integer userSalt) {
		this.userSalt = userSalt;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserBlacksign() {
		return userBlacksign;
	}
	public void setUserBlacksign(Integer userBlacksign) {
		this.userBlacksign = userBlacksign;
	}
	
//	public String getUserProvince() {
//		return userProvince;
//	}
//	public void setUserProvince(String userProvince) {
//		this.userProvince = userProvince;
//	}
//	public String getUserCity() {
//		return userCity;
//	}
//	public void setUserCity(String userCity) {
//		this.userCity = userCity;
//	}
//	public String getUserArea() {
//		return userArea;
//	}
//	public void setUserArea(String userArea) {
//		this.userArea = userArea;
//	}
//	public String getUserXpos() {
//		return userXpos;
//	}
//	public void setUserXpos(String userXpos) {
//		this.userXpos = userXpos;
//	}
//	public String getUserYpos() {
//		return userYpos;
//	}
//	public void setUserYpos(String userYpos) {
//		this.userYpos = userYpos;
//	}
	
}

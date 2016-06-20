package com.dffx.messageentry;

import java.io.Serializable;
import java.util.Date;

/**  
 *用户表
 * @author tongyicheng
 * @date 2015-06-25
 */
public class TAccount implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 3524897793678618464L;
	private Integer id;//主键id
    private Integer userSalt;//用户混肴码
    private String userPhone; //用户手机号码
    private String userAccount;//用户名称
    private String userPassword;//用户密码
    private Date userLastTime ;//用户最后一次登录时间
	private String userToken;
	private String userLastaddress;//用户最后登录地址
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
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
	
	public Date getUserLastTime() {
		return userLastTime;
	}
	public void setUserLastTime(Date userLastTime) {
		this.userLastTime = userLastTime;
	}
	
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	public String getUserLastaddress() {
		return userLastaddress;
	}
	public void setUserLastaddress(String userLastaddress) {
		this.userLastaddress = userLastaddress;
	}
	
	
	
}

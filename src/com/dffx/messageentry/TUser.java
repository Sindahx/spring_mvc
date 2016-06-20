package com.dffx.messageentry;


import java.io.Serializable;
import java.util.Date;


/**  
 *用户表
 * @author tongyicheng
 * @date 2015-06-25
 */
public class TUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7563215302503832062L;
	private Integer id;//主键id
	private Integer userUid;//账号id
	private String userPhone;//用户手机号码
    private String userNickname ; //用户昵称
    private Integer userSex ; //用户性别
    private long userBirthday ;//用户生日
    private String userHeadlink;//用户头像
    private Integer userLevel;//用户等级
    private Integer userType;//用戶類型
	private Date userRegedittime;//注册时间
	private Date userUpdatetime;//更新时间
	private Integer status;
	private Integer userStatus;
	private Integer userIscheck; //用户是否认证
	private String userDesc; //用户描述
	
	
	public String getUserDesc() {
		return userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserUid() {
		return userUid;
	}
	public void setUserUid(Integer userUid) {
		this.userUid = userUid;
	}
	
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public long getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(long userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserHeadlink() {
		return userHeadlink;
	}
	public void setUserHeadlink(String userHeadlink) {
		this.userHeadlink = userHeadlink;
	}
	public Integer getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}
	
	public Date getUserRegedittime() {
		return userRegedittime;
	}
	public void setUserRegedittime(Date userRegedittime) {
		this.userRegedittime = userRegedittime;
	}
	public Date getUserUpdatetime() {
		return userUpdatetime;
	}
	public void setUserUpdatetime(Date userUpdatetime) {
		this.userUpdatetime = userUpdatetime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getUserIscheck() {
		return userIscheck;
	}
	public void setUserIscheck(Integer userIscheck) {
		this.userIscheck = userIscheck;
	}
   
}

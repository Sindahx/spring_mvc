package com.dffx.businessentry;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *	 用户表
 */
public class User implements Serializable{

	private static final long serialVersionUID = 8527577963924632592L;
	private Integer id;//主键id
    private Integer userUid ;//主键用户id
    private String userName ;//用户名称
    private Integer userSex ; //用户性别
    private Long userBirthday ; //用户生日
    private String userIdentity ; // 用户身份
    private String userEmail;  // 用户邮箱
    private Integer userLevel; // 用户等级
    private Integer userIscheck ; // 用户认证状态 
    private String userLink;   // 认证资料
    private Integer userIsvip;  // VIP(0普通:1白银:2金牌:3砖石)
    private Integer userType;   // 用户类型(0:公众用户 1:企业用户 2:律师)
    private Timestamp userRegedittime;// 注册时间
    private Timestamp userUpdatetime; // 更新时间
    private Integer userProvince;//省份
    private Integer userCity;//城市
    private Integer userArea;//区域
    private String userDescription; // 律师用户为个人描述；个人用户为签名；企业用户为描述
    private String userHeadlink;   // 用户头像
    
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public Long getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Long userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
	public Timestamp getUserRegedittime() {
		return userRegedittime;
	}
	public void setUserRegedittime(Timestamp userRegedittime) {
		this.userRegedittime = userRegedittime;
	}
	public Timestamp getUserUpdatetime() {
		return userUpdatetime;
	}
	public void setUserUpdatetime(Timestamp userUpdatetime) {
		this.userUpdatetime = userUpdatetime;
	}
	public Integer getUserCity() {
		return userCity;
	}
	public void setUserCity(Integer userCity) {
		this.userCity = userCity;
	}
	public Integer getUserArea() {
		return userArea;
	}
	public void setUserArea(Integer userArea) {
		this.userArea = userArea;
	}
	public Integer getUserProvince() {
		return userProvince;
	}
	public void setUserProvince(Integer userProvince) {
		this.userProvince = userProvince;
	}
	public Integer getUserIscheck() {
		return userIscheck;
	}
	public void setUserIscheck(Integer userIscheck) {
		this.userIscheck = userIscheck;
	}
	public String getUserLink() {
		return userLink;
	}
	public void setUserLink(String userLink) {
		this.userLink = userLink;
	}
	public Integer getUserIsvip() {
		return userIsvip;
	}
	public void setUserIsvip(Integer userIsvip) {
		this.userIsvip = userIsvip;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	
	
}

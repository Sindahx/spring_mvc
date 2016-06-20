package com.dffx.businessentry;

import java.io.Serializable;

/**
 * 邀请记录
 * @author charlotte H.Y
 *
 */
public class Inviterecord implements Serializable{
	
	private static final long serialVersionUID = -935214005891303708L;
	
	private int inviter;
	private int invitee;
	private String inviteetel;
	private Long regtime;
	private int logintime;
	
	public int getInviter() {
		return inviter;
	}
	public void setInviter(int inviter) {
		this.inviter = inviter;
	}
	public int getInvitee() {
		return invitee;
	}
	public void setInvitee(int invitee) {
		this.invitee = invitee;
	}
	
	public String getInviteetel() {
		return inviteetel;
	}
	public void setInviteetel(String inviteetel) {
		this.inviteetel = inviteetel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getRegtime() {
		return regtime;
	}
	public void setRegtime(Long regtime) {
		this.regtime = regtime;
	}
	public int getLogintime() {
		return logintime;
	}
	public void setLogintime(int logintime) {
		this.logintime = logintime;
	}
	
	
	
	

}

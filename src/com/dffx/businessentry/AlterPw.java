package com.dffx.businessentry;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 支付密码变更日志
 * @author H.Y
 *
 */
public class AlterPw implements Serializable{

	private static final long serialVersionUID = 3370081692779756137L;
	
	private Integer userId;//用户id
	private String alterPassword;//变更后密码
	private Timestamp time;//变更时间
	private Integer type;//变更类型
	private Integer form;//变更方式
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAlterPassword() {
		return alterPassword;
	}
	public void setAlterPassword(String alterPassword) {
		this.alterPassword = alterPassword;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getForm() {
		return form;
	}
	public void setForm(Integer form) {
		this.form = form;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}

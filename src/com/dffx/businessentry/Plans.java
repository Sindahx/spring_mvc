package com.dffx.businessentry;

import java.io.Serializable;

/**
 * 活动类
 * @author Charlotte H.Y
 *
 */
public class Plans  implements Serializable{

	private static final long serialVersionUID = -864466595260772128L;
	
	private String actionTitle;//活动标题
	private String actionDes;//活动描述
	private Long begintime;//开始时间
	private Long endTime;//结束时间
	private int status;//活动状态
	private int type;//活动类型
	public String getActionTitle() {
		return actionTitle;
	}
	public void setActionTitle(String actionTitle) {
		this.actionTitle = actionTitle;
	}
	public String getActionDes() {
		return actionDes;
	}
	public void setActionDes(String actionDes) {
		this.actionDes = actionDes;
	}
	public Long getBegintime() {
		return begintime;
	}
	public void setBegintime(Long begintime) {
		this.begintime = begintime;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}

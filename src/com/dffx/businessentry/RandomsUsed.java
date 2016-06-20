package com.dffx.businessentry;

import java.io.Serializable;
import java.util.Date;

/**  
 *随机码已使用生成表
 * @author tongyicheng
 * @date 2015-09-09
 */
public class RandomsUsed implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7949412194110949968L;
	private Integer id;//主键id
    private String randomCode;//随机码
    private Date createTime;//创建日期
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getRandomCode() {
		return randomCode;
	}
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
   
}

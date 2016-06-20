package com.dffx.businessentry;

import java.io.Serializable;
import java.util.Date;

/**  
 *热门号码实体类
 * @author tongyicheng
 * @date 2015-09-10
 */
public class RandomsHot implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 3761426388066182415L;
	private Integer id;//主键id
    private Integer isUsing;//是否正在使用
    private String randomCode;//热门号码
    private Date createTime;//创建日期
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getIsUsing() {
		return isUsing;
	}
	public void setIsUsing(Integer isUsing) {
		this.isUsing = isUsing;
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

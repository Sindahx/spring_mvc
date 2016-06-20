package com.dffx.service.user;


public interface SetUserInfoService {

	
    
    /**
     * 设置用户头像
     * @param headLink
     * @param userUid
     * @return
     */
    public Integer setHeadLink(String headLink,Integer userUid)throws Exception;
    
  
  
}

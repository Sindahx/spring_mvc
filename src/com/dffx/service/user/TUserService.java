package com.dffx.service.user;

import com.dffx.messageentry.TUser;


/**  
 *
 * @author tongyicheng
 * @date 2015-07-13
 */
public interface TUserService {

	 /**
     * 添加用戶
     * @param user
     */
    public void saveTUser(TUser user);
    
    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    public TUser getTUserByName(String userUid);
    
    /**
     * 根据id查找用户
     * @param name
     * @return
     */
    public TUser getTUserById(String userId);
    
}

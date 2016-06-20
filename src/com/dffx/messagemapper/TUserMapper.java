package com.dffx.messagemapper;

import com.dffx.messageentry.TUser;


/**  
*
* @author tongyicheng
* @date 2015-07-13
*/
public interface TUserMapper  extends SqlMapper{

    /**
     * 添加用戶
     * @param user
     */
    public void saveTUser(TUser user);
    
    /**
     * 根据用户名查找用户
     * @param uid
     * @return
     */
    public TUser getTUserByName(String name);
    
    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    public TUser getTUserById(String userId);
    
    /**
     * 更新用户
     * @param user
     * @return
     */
    public Integer setTUserById(TUser user);
}

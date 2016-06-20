package com.dffx.businessmapper;

import org.apache.ibatis.annotations.Param;

import com.dffx.businessentry.User;

/**
 *  用户信息DAO 
 */
public interface UserMapper  extends SqlMapper{

    /**
     * 根据uid查找用户
     * @param name
     * @return
     */
    public User getUserByUid(Integer uid);

    /**
     * 更新用户基本信息
     * @param user
     */
    public void updateUser(User user);
    
    /**
     *  修改用户认证状态
     */
    public void updateUserIsCheck(@Param("status")Integer status,@Param("uid")Integer uid);
    
    /**
     * 添加用戶
     * @param user
     */
    public void saveUser(User user);
    
    /**
     * 设置用户头像
     * @param headLink
     * @param userUid
     * @return
     */
    public Integer setHeadLink(@Param("headLink")String headLink,@Param("userUid")Integer userUid) throws Exception;
    
}

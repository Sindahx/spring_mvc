package com.dffx.service.user.imp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dffx.businessmapper.UserMapper;
import com.dffx.messageentry.TUser;
import com.dffx.messagemapper.TUserMapper;
import com.dffx.service.user.SetUserInfoService;

@Service("setUserInfoService")
public class SetUserInfoServiceImpl implements SetUserInfoService {

	@Autowired
	protected UserMapper userMapper;
	@Autowired
	protected TUserMapper tuserMapper;
	


	@Override
	public Integer setHeadLink(String headLink, Integer userUid) throws Exception {
		// TODO Auto-generated method stub
		int a = userMapper.setHeadLink(headLink, userUid);
		if (a != 1) {
			return 0;
		}
		TUser user = new TUser();
		user = tuserMapper.getTUserByName(String.valueOf(userUid));
		user.setUserHeadlink(headLink);
		user.setUserUpdatetime(new Date());
		int b = tuserMapper.setTUserById(user);
		
		System.err.println(user.getUserUpdatetime());
		if (b != 1) {
			return 0;
		}
		return 1;
	}



}

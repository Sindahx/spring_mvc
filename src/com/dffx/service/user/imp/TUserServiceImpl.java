package com.dffx.service.user.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dffx.messageentry.TUser;
import com.dffx.messagemapper.TUserMapper;
import com.dffx.service.user.TUserService;
import com.dffx.utils.Validator;
import com.dffx.webservice.util.OrderState;

/**
 * 
 * @author tongyicheng
 * @date 2015-06-25
 */
@Service("tuserService")
public class TUserServiceImpl implements TUserService {

	@Autowired
	protected TUserMapper tuserMapper;

	@Override
	public TUser getTUserById(String userId) {
		// TODO Auto-generated method stub
		TUser tuser = tuserMapper.getTUserById(userId);
		if (tuser.getUserType() == OrderState.USERTYPE_USER || tuser.getUserType() == OrderState.USERTYPE_COMPANY) {
			tuser.setUserIscheck(OrderState.USERISCHECK_OK);
		}
		return tuser;
	}

	@Override
	public TUser getTUserByName(String userUid) {
		// TODO Auto-generated method stub

		TUser tuser = tuserMapper.getTUserByName(userUid);
		
		if (Validator.isBlank(tuser)) {
			return tuser;
		}
		if (tuser.getUserType() == OrderState.USERTYPE_USER || tuser.getUserType() == OrderState.USERTYPE_COMPANY) {
			tuser.setUserIscheck(OrderState.USERISCHECK_OK);
		}
		
		return tuser;
	}

	@Override
	public void saveTUser(TUser user) {
		// TODO Auto-generated method stub

		tuserMapper.saveTUser(user);
	}

}

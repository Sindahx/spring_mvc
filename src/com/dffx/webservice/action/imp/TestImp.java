package com.dffx.webservice.action.imp;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.dffx.webservice.action.Test;

@Component
@WebService(serviceName="userService", endpointInterface = "com.dffx.webservice.action.Test")  
public class TestImp implements Test {

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return "user";
	}

}

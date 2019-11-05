package com.mycompany.spring_rest_application.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_rest_application.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {
	 @Autowired
	 private LoginDao loginDao;
	 
	@Override
	public int validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDao.validateUser(userName, password);
	}
	
}

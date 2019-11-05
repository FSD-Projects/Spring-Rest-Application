package com.mycompany.spring_rest_application.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	public int validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		if(userName.equals("dummy") && password.equals("dummy")) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

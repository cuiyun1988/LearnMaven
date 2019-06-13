package com.cy.mavenManager;

import com.cy.mavenServiceI.UserServiceI;
import com.cy.mavenServiceImpl.UserServiceImpl;

import mavenModel.User;

public class UserContorlle {
	User user=new User();
	UserServiceI USI = new UserServiceImpl();
	public void bb() {
		user.setName("123");
		USI.save(user);
	}
	
}

package com.cy.mavenServiceImpl;

import com.cy.mavenDao.UserDaoI;
import com.cy.mavenDaoImpl.UserDaoImpl;
import com.cy.mavenServiceI.UserServiceI;

import mavenModel.User;

public class UserServiceImpl implements UserServiceI {
	UserDaoI udi = new UserDaoImpl();
	public void save(User user) {
		udi.save(user);
	}
}

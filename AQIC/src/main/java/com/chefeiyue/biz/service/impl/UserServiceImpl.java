package com.chefeiyue.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chefeiyue.biz.dao.UserDao;
import com.chefeiyue.biz.service.UserService;
import com.chefeiyue.db.model.User;
import com.chefeiyue.db.model.UserExample;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDaoImpl;
	
	public void addUser(User user) {
		userDaoImpl.addUserByPost(user);
		
	}

	public User getUserById(Integer id) {
		
		return userDaoImpl.getUserById(id);
	}

}

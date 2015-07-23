package com.chefeiyue.biz.service;

import com.chefeiyue.db.model.User;

public interface UserService {
	
	public void addUser(User user);
	
	public User getUserById(Integer id);
}

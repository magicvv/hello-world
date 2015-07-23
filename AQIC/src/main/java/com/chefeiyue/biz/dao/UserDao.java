package com.chefeiyue.biz.dao;

import com.chefeiyue.db.model.User;

public interface UserDao {

	public void addUserByPost(User user);
	
	public User getUserById(Integer Id);
}

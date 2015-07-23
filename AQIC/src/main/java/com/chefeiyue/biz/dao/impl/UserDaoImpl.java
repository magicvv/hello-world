package com.chefeiyue.biz.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chefeiyue.biz.dao.UserDao;
import com.chefeiyue.db.mapper.UserMapper;
import com.chefeiyue.db.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;
	
	public void addUserByPost(User user) {
		userMapper.insert(user);
	}

	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}

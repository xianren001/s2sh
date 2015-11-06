package com.joy.s2sh.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joy.s2sh.dao.UserDao;
import com.joy.s2sh.entity.User;
import com.joy.s2sh.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public Serializable save(User user) {
		return userDao.save(user);
	}

}

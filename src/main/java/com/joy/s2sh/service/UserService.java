package com.joy.s2sh.service;

import java.io.Serializable;

import com.joy.s2sh.entity.User;

public interface UserService {
	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	public Serializable save(User user);
}

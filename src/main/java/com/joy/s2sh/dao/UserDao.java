package com.joy.s2sh.dao;

import java.io.Serializable;

import com.joy.s2sh.entity.User;

public interface UserDao {

	Serializable save(User user);
}

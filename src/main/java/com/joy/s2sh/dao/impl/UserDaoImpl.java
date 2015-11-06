package com.joy.s2sh.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.joy.s2sh.dao.UserDao;
import com.joy.s2sh.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Serializable save(User user) {
		try {
			return sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

}

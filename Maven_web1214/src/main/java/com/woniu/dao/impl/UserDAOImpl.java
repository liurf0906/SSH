package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
import com.woniu.util.HibernateUtils;

public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User obj) {
		
		HibernateUtils.getSession().save(obj);
		
	}

	@Override
	public void update(User obj) {

		HibernateUtils.getSession().update(obj);
		
	}

	@Override
	public void delete(User obj) {

		HibernateUtils.getSession().delete(obj);
		
	}

	@Override
	public User findOne(Integer id) {
		User user = (User) HibernateUtils.getSession().get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> list = HibernateUtils.getSession().createQuery("from User").list();
		return list;
	}

	@Override
	public User login(String name) {
//		User user = (User) HibernateUtils.getSession().createQuery("from User where uname="+name).uniqueResult();
		User user = (User) HibernateUtils.getSession().createQuery("from User where uname='" + name + "'").uniqueResult();
		
		return user;
	}

}

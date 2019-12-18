package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.woniu.dao.IUserDAO;
import com.woniu.dao.impl.UserDAOImpl;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
import com.woniu.util.HibernateUtils;

import ognl.SetPropertyAccessor;

public class UserServiceImpl implements IUserService {
	
	IUserDAO ud = new UserDAOImpl();
	
	@Override
	public void save(User obj) {
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			obj.setUpwd("123456");
			ud.save(obj);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
	}

	@Override
	public void update(User obj) {
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			ud.update(obj);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
	}

	@Override
	public void delete(User obj) {
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			ud.delete(obj);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
	}

	@Override
	public User findOne(Integer id) {
		User user = null;
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			user = ud.findOne(id);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> user = new ArrayList<User>();
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			user = ud.findAll();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
		return user;
	}

	@Override
	public User login(User user) {
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			System.out.println(user.getUname());
			User temp = ud.login(user.getUname());
			if(temp!=null && temp.getUpwd().equals(user.getUpwd())){
				return temp;
			}
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
		return null;
	}

}

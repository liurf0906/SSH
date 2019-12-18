package com.woniu.dao.impl;

import java.util.List;

import com.woniu.dao.IRoleDAO;
import com.woniu.pojo.Role;
import com.woniu.util.HibernateUtils;

public class RoleDAOImpl implements IRoleDAO {

	@Override
	public void save(Role obj) {
		// TODO Auto-generated method stub
		HibernateUtils.getSession().save(obj);
	}

	@Override
	public void update(Role obj) {
		// TODO Auto-generated method stub
		HibernateUtils.getSession().update(obj);
	}

	@Override
	public void delete(Role obj) {
		// TODO Auto-generated method stub
		HibernateUtils.getSession().delete(obj);
	}

	@Override
	public Role findOne(Integer id) {
		// TODO Auto-generated method stub
		Role role = (Role) HibernateUtils.getSession().get(Role.class, id);
		return role;
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		List<Role> list = HibernateUtils.getSession().createQuery("from Role").list();
		return list;
	}

}

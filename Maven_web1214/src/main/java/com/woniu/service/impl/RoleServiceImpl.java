package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.woniu.dao.IRoleDAO;
import com.woniu.dao.impl.RoleDAOImpl;
import com.woniu.pojo.Role;
import com.woniu.service.IRoleService;
import com.woniu.util.HibernateUtils;

public class RoleServiceImpl implements IRoleService {
	
	IRoleDAO rd = new RoleDAOImpl();

	@Override
	public void save(Role obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Role obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll() {
		List<Role> role = new ArrayList<Role>();
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();
		try {
			role = rd.findAll();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession();
		}
		return role;
	}

}

package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Role;

public interface IRoleService {
	void save(Role obj);
	void update(Role obj);
	void delete(Role obj);
	Role findOne(Integer id);
	List<Role> findAll();
}

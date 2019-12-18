package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserDAO {
	
	void save(User obj);
	void update(User obj);
	void delete(User obj);
	User findOne(Integer id);
	List<User> findAll();
	User login(String name);

}

package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserService {
	
	void save(User obj);
	void update(User obj);
	void delete(User obj);
	User findOne(Integer id);
	List<User> findAll();
	User login(User user);

}

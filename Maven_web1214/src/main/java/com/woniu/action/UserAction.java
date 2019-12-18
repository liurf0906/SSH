package com.woniu.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
import com.woniu.service.impl.UserServiceImpl;
import com.woniu.util.Utils;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private IUserService us = new UserServiceImpl();
	private List<User> users = new ArrayList<User>();
	private File photo;
	private String photoFileName;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUs() {
		return us;
	}
	public void setUs(IUserService us) {
		this.us = us;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public String login(){
		
		user = us.login(user);
		
		if(user!=null){
			
			ActionContext.getContext().getSession().put("loginUser", user);
			return "success";
		}
		return "false";
	}
	
	public String findAll() {
		users = us.findAll();
		return "show";
	}
	
	public String save(){
		String fileName = Utils.upload(photo, photoFileName);
		user.setUphoto(fileName);
		User loginUser = (User) ActionContext.getContext().getSession().get("loginUser");
		
		user.setRole(loginUser.getRole());
		us.save(user);
		return "saveOne";
	}

}

package com.woniu.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniu.pojo.Role;
import com.woniu.service.IRoleService;
import com.woniu.service.impl.RoleServiceImpl;

public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	private Role role = new Role();
	private List<Role> roles = new ArrayList<Role>();
	IRoleService rs = new RoleServiceImpl();
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public Role getModel() {
		// TODO Auto-generated method stub
		return role;
	}
	
	public List<Role> getRole(){
		roles = rs.findAll();
		return roles;
	}
}

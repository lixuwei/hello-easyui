package com.lee.study.easyui.web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.service.UserService;
import com.lee.study.easyui.web.vo.Combobox;
import com.lee.study.easyui.web.vo.Pagination;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @description 关于User CRUD的一些方法
 * 
 * @author lee
 * @createTime 2013-4-24 下午1:53:11 
 *
 * @Type com.lee.study.easyui.web.action.UserAction
 */
@ParentPackage("basePackage")
@Namespace("/study/user")
public class UserAction extends BaseAction implements ModelDriven<User> {
	
	private int page;
	private int rows;
	
	private String firstName="";
	private String lastName="";
	
	private Pagination<User> pagination;
	
	@Autowired
	private UserService userService;
	
	
	private User user = new User();
	
	/**
	 * 查询所有的User
	 * @return
	 */
	@Action("findAllUser")
	public void findAllUser(){
		
		pagination = userService.findAllUser(page,rows);
		super.writeJson(pagination);
		
	}
	@Action("saveUser")
	public void saveUser(){
		Map<String,String> map = new HashMap<String,String>();
		if(user == null){
			
			map.put("errorMsg", "保存失败");
			super.writeJson(map);
		}else{
			userService.save(user);
			this.writeJson(map);
		}	
	}
	@Action("findAllUserBySearch")
	public void findAllUserBySearch(){
		pagination = userService.findAllUserBySearch(page,rows,firstName,lastName);
		writeJson(pagination);
	}
	
	@Action("updateUser")
	public void updateUser(){
		Map<String,String> map = new HashMap<String,String>();
		if(user == null){
			map.put("errorMsg", "更新失败");
			super.writeJson(map);
		}else{
			userService.updateUser(user);
			this.writeJson(map);
		}
	}
	@Action("destroyUser")
	public void destroyUser(){
		Map<String,String> map = new HashMap<String,String>();
		if(user == null){
			map.put("errorMsg", "更新失败");
			super.writeJson(map);
		}else{
			userService.deleteUserById(user.getId());
			map.put("success", "deleted");
			this.writeJson(map);
		}
		
	}
	@Action("findLanguage")
	public void findLanguage(){
		List<Combobox> comboboxs = new ArrayList<Combobox>();
		comboboxs.add(new Combobox(1,"java"));
		comboboxs.add(new Combobox(2,"c#"));
		comboboxs.add(new Combobox(3,"ruby"));
		comboboxs.add(new Combobox(4,"python"));
		
		writeJson(comboboxs);
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public Pagination<User> getPagination() {
		return pagination;
	}
	public void setPagination(Pagination<User> pagination) {
		this.pagination = pagination;
	}
	@Override
	public User getModel() {
		
		return this.user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

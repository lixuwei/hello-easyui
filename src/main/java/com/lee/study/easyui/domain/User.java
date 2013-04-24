package com.lee.study.easyui.domain;

import java.io.Serializable;

/**
 * @description 用户实体
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午9:54:35
 * 
 * @Type com.lee.study.easyui.domain.User
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

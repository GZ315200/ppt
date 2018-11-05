package com.my.entity;

import java.util.Date;


public class User {
	private int id;
	private String name;
	private String password;
	private boolean gender;
	private Date brithday;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password, boolean gender, Date brithday) {
//		super.setId(id);
		this.id = id; 
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.brithday = brithday;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", brithday="
				+ brithday + "]";
	}
	
	
}

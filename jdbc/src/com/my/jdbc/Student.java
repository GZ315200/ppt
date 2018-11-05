package com.my.jdbc;

import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private String gender;
	private int age;
	private Date brithday;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String gender, int age, Date brithday) {
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.age = age;
		this.brithday = brithday;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", age=" + age + ", brithday="
				+ brithday + "]";
	}

	
	
	
}

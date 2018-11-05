package com.my.oracle.entity;

import java.util.Date;

public class Stu_Bean {
	
	  private int sid;
	  private String sname;
      private int age;
	  private String gender;
      private Date brithday;
      
	public Stu_Bean() {}
	
	public Stu_Bean(int sid, String sname, int age, String gender, Date brithday) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.gender = gender;
		this.brithday = brithday;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int i) {
		this.sid = i;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
		return "Stu_Bean [sid=" + sid + ", sname=" + sname + ", age=" + age + ", gender=" + gender + ", brithday="
				+ brithday + "]";
	}
      
    
}

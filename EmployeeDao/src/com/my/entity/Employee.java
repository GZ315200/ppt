package com.my.entity;

import java.util.Date;

public class Employee {
	private int id; // 主键
	private String name; // 姓名
	private Date joinTime; // 入职时间年月日时分秒
	private boolean gender; // 性别
	private String job; // 职位
	private double salary; // 月薪

	public Employee() {
	}

	public Employee(int id, String name, Date joinTime, boolean gender, String job, double salary) {
		this.id = id;
		this.name = name;
		this.joinTime = joinTime;
		this.gender = gender;
		this.job = job;
		this.salary = salary;
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

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joinTime=" + joinTime + ", gender=" + gender + ", job="
				+ job + ", salary=" + salary + "]";
	}

	
}

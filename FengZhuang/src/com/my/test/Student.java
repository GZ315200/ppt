package com.my.test;

public class Student {
	private static String country;
	private String name;
	static {
		country = "中国";
		System.out.println("Student类已经加载");
	}

	public Student(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("我的名字是:" + name + ",国家是:" + country);
	}

	public static void main(String[] args) {
		 Student stu = new Student("张三");
												 stu.displayInfo(); 
	}
}

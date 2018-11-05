package com.my.test;


public class Dog {
	private static int count = 100;//静态初始化
	private int id;
	private String name;

	public Dog(String name) {
		this.name = name;
		id = count++;
	}

	public void displayInfo() {
		System.out.println("名字是:" + name + "编号是" + id);
	}

	public static void currentCount() {
		System.out.println("当前编号是" + count);
	}

	public static void main(String[] args) {
		Dog.currentCount();
		Dog dog = new Dog("小黑");
		dog.displayInfo();
		Dog dog2 = new Dog("旺财");
		dog2.displayInfo();
		Dog.currentCount();
	}
}

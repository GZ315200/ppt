package com.my.cn;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void enjoy() {
		System.out.println("叫声......");
	}
}

class Cat extends Animal {
	
	private String eyesColor;

	public Cat(String n,String c) {
		super(n);
		this.eyesColor = c;
	}

	public void enjoy() {
		System.out.println("喵~喵~");//重写父类的enjoy方法
	}
}

class Dog extends Animal {
	private String furColor;

	public Dog(String n,String d) {
		super(n);
		this.furColor = d;
	}

	public void enjoy() {
		System.out.println("汪~汪~");
	}
}

class Lady {
	private String name;
	private Animal pet;

	public Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}

	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class DynamicBindingTest {
	public static void main(String args[]) {
		Cat c = new Cat("catname", "blue");
		Lady l = new Lady("张女士", c);
		l.myPetEnjoy();
	}
}
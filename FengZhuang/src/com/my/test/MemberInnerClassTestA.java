package com.my.test;

public class MemberInnerClassTestA {
	public static void main(String[] args) {
		
		(new AClass("redhacker") {

			public void print() {
				// 对父类的print方法进行覆盖

//				System.out.println("the anonymose class print");
				super.print(); // 调用父类中的print方法
			}
		}).print(); // 调用覆盖后的print方法

	}
}

class AClass {
	private String name;

	AClass(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("SuperClass:The name = " + name);
	}
}
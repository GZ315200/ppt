package com.my.test;

public class TestObject {

	
	
	public static void main(String[] args) {
		TestObject obj = new TestObject();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());

		TestObject obj2 = new TestObject();
		System.out.println(obj.equals(obj2));
	}
}
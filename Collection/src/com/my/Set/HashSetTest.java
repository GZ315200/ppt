package com.my.Set;

import java.util.HashSet;
import java.util.Iterator;

import com.my.Comparable.Student;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+"===================HashSet======================");

		HashSet<Integer> set = new HashSet<Integer>();
				
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(30);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(7);

		Iterator<Integer> it = set.iterator();
		 
		while (it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println("\n"+"=========================================");
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println("\n"+"=========================================");

		for (Integer integer : set) {
			System.out.print(integer+"  ");
		}
		
		System.out.println("\n"+"==============HashSet添加学生类对象===========================");

		HashSet<Student> stu = new HashSet<>();
		
		stu.add(new Student("alice", 22, 01));
		stu.add(new Student("corrun", 23, 02));
		stu.add(new Student("bear", 20, 03));
		stu.add(new Student("bear", 20, 03));

		for (Student student : stu) {
			System.out.println(student);
		}
	}

	
}

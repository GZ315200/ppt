package com.my.Set;

import java.util.LinkedHashSet;

import com.my.Comparable.Student;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
		
		lhs.add(new Student("alice", 22, 01));
		lhs.add(new Student("alice", 22, 01));
		lhs.add(new Student("alice", 22, 04));
		lhs.add(new Student("corrun", 23, 02));
		lhs.add(new Student("bear", 20, 03));

		for (Student student : lhs) {
			System.out.println(student);
		}
	}

}

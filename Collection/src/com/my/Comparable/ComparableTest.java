package com.my.Comparable;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Student s1 = new Student("a", 18, 4);
		Student s2 = new Student("b", 16, 2);
		Student s3 = new Student("c", 10, 1);
		Student s4 = new Student("d", 12, 5);
		Student s5 = new Student("e", 14, 3);
		
	//	Comparable<Student> c = new 
		
		TreeSet<Student> tr = new TreeSet<>();
		
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		tr.add(s4);
		tr.add(s5);

		tr.comparator();
		for (Student s : tr) {
			System.out.println(s);
		}
	
	}

}

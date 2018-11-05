package com.my.Comparator;

import java.util.Comparator;

import com.my.Comparable.Student;

public class ComparatorTest implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getNo() == o2.getNo()){
			return 0;
		}else if(o1.getNo() < o2.getNo()){
			return -1;
		}else if(o1.getNo() > o2.getNo()){
			return 1;
		}
		return 0;
	}
	
	
	
}

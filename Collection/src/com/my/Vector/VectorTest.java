package com.my.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> s = new Vector<>();
		
		s.add("����");
		s.add("����");
		s.add("�;�");
		
		System.out.println(s.size());
		
		s.remove(0);
		
		System.out.println(s.size());
		
		Object[] a = s.toArray();
		for (Object o : a) {
			System.out.println(o);
		}
	}

}

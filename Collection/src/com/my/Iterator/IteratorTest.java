package com.my.Iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * 迭代器遍历			集合的三种遍历方式
 * @author 丫丫
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<>();
		v.add("a");
		v.add("b");
		v.add("c");
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()){
			//boolean a = it.hasNext();
			String a = it.next();
			System.out.print(a+"  ");
		}
		System.out.println("\n"+"=========================================");
		
		for (Iterator<String> it1 = v.iterator(); it1.hasNext();) {
			System.out.print(it1.next()+"  ");
		}
		System.out.println("\n"+"=========================================");
		
		for (String s : v) {
			System.out.print(s+"  ");
		}
	}

}

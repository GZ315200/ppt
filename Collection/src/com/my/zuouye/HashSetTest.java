package com.my.zuouye;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**	һ������һ��ѧ���࣬
1.���ĳ�Ա������int sid, String name, int age, double score
2.������дtoString()������
3.��дhashCode()������equals()����
4.����3��ѧ�����󣬷��õ�HashSet�У��ٰ�������������
5.����3��ѧ�����󣬷��õ�ArrayList�У�����for������������
*/
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===================HashSet=========================");
		HashSet<Student01> h1 = new HashSet<>();
		
		h1.add(new Student01(02, "bbb", 22, 90));
		h1.add(new Student01(01, "aaa", 18, 98.5));
		h1.add(new Student01(03, "ccc",16, 95));
		h1.add(new Student01(04, "ddd", 20, 92));
		
		Iterator<Student01> it = h1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("===================HashSet=========================");
		for (Iterator iterator = h1.iterator(); iterator.hasNext();) {
			Student01 student = (Student01) iterator.next();
			System.out.println(student);
		}
		System.out.println("===================HashSet=========================");
		for (Student01 student : h1) {
			System.out.println(student);
		}
		System.out.println("===================ArrayList=========================");
		ArrayList<Student01> a1 = new ArrayList<>();
		
		a1.add(new Student01(02, "bbb", 22, 90));
		a1.add(new Student01(01, "aaa", 18, 98.5));
		a1.add(new Student01(03, "ccc",16, 95));
		a1.add(new Student01(04, "ddd", 20, 92));
		
		for (Student01 student : a1) {
			System.out.println(student);
		}
		System.out.println("===================ArrayList=========================");
		for (Iterator iterator = a1.iterator(); iterator.hasNext();) {
			Student01 student = (Student01) iterator.next();
			System.out.println(student);
		}
		
		System.out.println("===================HashSet=========================");

		HashSet<Animal03> h2 = new HashSet<>();
		h2.add(new Animal03("����", "��ɫ", 1000));
		h2.add(new Animal03("����", "��ɫ", 0.1));
		h2.add(new Animal03("����", "��ɫ", 55.5));
		
		for (Animal03 animal03 : h2) {
			System.out.println(animal03);
		}
		System.out.println("===================ArrayList=========================");
		
		ArrayList<Animal03> a2 = new ArrayList<>();
		
		a2.add(new Animal03("����", "��ɫ", 1000));
		a2.add(new Animal03("����", "��ɫ", 0.1));
		a2.add(new Animal03("����", "��ɫ", 55.5));
		
		for (Animal03 animal03 : a2) {
			System.out.println(animal03);
		}
	}

		
}

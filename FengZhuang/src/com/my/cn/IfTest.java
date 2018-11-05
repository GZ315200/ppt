package com.my.cn;

public class IfTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 11;
		int o = 22;
		test(i);
		test(o);
	}
	public static void test(int a){
		if (a%2 == 0) {
				System.out.println(a+"是偶數");	
				}else{
					System.out.println(a+"是计数");
				}
	}

}

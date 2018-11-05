package com.my.cn;

public class ReturnTest {

	public static void main(String[] args) {

		int i = test(10,20);  //定义一个变量去接收方法的返回（结果）值		
		System.out.println(-i%4);
	}

	public static int test(int a,int b){
		int sum = a +b;
		return sum;
	}
}

package com.my.cn;
/*
 * 递归调用     交给程序自己去完成后继的阶乘（方法）
 */
public class DiGui {

	public static void main(String[] args) {

		System.out.println(factTest(10));
	}

	public static int factTest(int a){
		if(a == 1 || a == 0){
			return 1;

		}else {
			return a*factTest(a-1);
		}
		
	}
}

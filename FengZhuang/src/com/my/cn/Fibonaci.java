package com.my.cn;
/*
 * •求出斐波那契数列第n个数的值 
 * •1、1、2、3、5、8、13、21、…… 
 */
public class Fibonaci {

	public static void main(String[] args) {

		System.out.println(test(6));
	}

//	int r ;
//1 1 2 3 5 8 
	public static int test(int a){
		int sum = 0;
		if(a == 1 || a ==2){
			return 1;
		}else{
			sum = test(a-1)+test(a-2);
			return sum;
		}
		
	}
	
}

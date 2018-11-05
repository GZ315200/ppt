package com.my.zuoye;

import java.util.Iterator;

/**
 * @author 丫丫 4.打印如下形状 (#号数：n 空格数：n-＃号数) # ## ### #### ##### ###### #######
 */
public class DaYin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test();
		 System.out.println(add(9.0, 10.0, 100.0, 123.0)); 
	}

	public static void test() {
		// for (int i = 1; i < 8; i++) {
		// for (int j = 1; j < 8 - i; j++) {
		// System.out.print(" ");
		// }
		// for(int k = 8 - i; k < 8; k++){
		// System.out.print("#");
		// }
		// System.out.println();
		//
		// }

		// int[] a = new int[16];
		// for(int i = 0; i < a.length; i++)
		// {
		// for (int j = 0; j <= i; j+=2) {
		// a[i] = j;
		// }
		// System.out.print(a[i] + "\t");
		// }

	}

	public static double add(double... nums) {
		double result = 0.0;
		System.out.println(nums.getClass().isArray());
		for (double d : nums) {
			result += d;
		}
		return result;
	}

}

package com.my.cn;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	private static final int Integer = 0;

	public static void main(String[] args) {

		// int x=1234; x= x / 1000 * 1000;

		// int a = 3; int b = 0; b = ++a;

		// int sum = 1;
		// for (int i = 1; i <= 10; i++) {
		// sum *= i;
		// }
		// System.out.println(sum);

		// System.out.println(x);

		// System.out.println(10 % 4);
		// System.out.println(4 % 4);
		// System.out.println(2 % 4);
		// System.out.println(-1 % 4);
		//
		// int i = 6 ^ 3 ^ 4;

		// int i = 3 << 2;
		// int i = 3;

		// if ((i < 30 ) && i % 10 != 0) {
		// System.out.println("true");
		// }
		// System.out.println(i<30 && (i%10 != 0) ? true:false);

		/**
		 * int j = 0; for (int i = 0; i < 200; i++) {
		 * 
		 * if (i % 7 == 0 & i % 4 != 0) { System.out.print(i+" \t"); j++; } if
		 * (j == 6) { System.out.println(); j = 0; } }
		 */

		// List<Integer> arr = new ArrayList<Integer>();

		// for (int i = 0; i < 10; i++) {
		// if (i == 3) {
		//
		// System.out.println("Game Over!");
		// break;
		// }
		// System.out.println(" i =" + i);
		// }

		for (int i = 0; i < 100; i++) {
			if (i % 10 != 0) {
				continue;
			}
			System.out.println(i);
		}

		// if (arr.size() == 6) {
		// System.out.println();
		// }
	}
	// int arr[][] = new a[][];

}
/**
 * 打印输出0~200乊间能被7整除但丌能被4整除的所有整数；要求每行 显示6个数据 int x=1234; x= x / 1000 * 1000; x=?
 * 10 % 4 = ?; 4 % 4 = ?; 2 % 4 = ?; -1 % 4 = ? int i = 3; int j = 0; j = i++; i
 * = ?, j=? int i = 3; int j = 0; j = ++i; i = ?, j=?
 */

package com.my.cn;

/*
 * 打印输出0~200乊间能被7整除但丌能被4整除的所有整数；要求每行 显示6个数据； 
 */
public class Test01 {

	public static void main(String[] args) {

		int n = 0;
		for (int i = 0; i < 200; i++) {

			if ((i % 7 == 0) && (i % 4 != 0)) {
				System.out.print(i + "  ");
				n++;
			}

			if (n == 6) {
				System.out.println();
				n = 0;
			}
		}

		// public static int test(int e){

	}

}

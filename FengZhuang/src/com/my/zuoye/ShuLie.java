package com.my.zuoye;
/**
 * @author 丫丫
 *	6. 在命令行输出如下数字
	1
	2 3 
	4 5 6 
	7 8 9 10
 */
public class ShuLie {
	
	public static void main(String[] args) {
		test();
	}
//	int[][] a = new int[i][j];
	public static void test(){
		int a = 0;

		for(int i=0; i<5; i++){
			for(int j=0; j<=i;j++){
				++a;
				System.out.print(a+"\t");
			}
			System.out.println();
		}
	}
}

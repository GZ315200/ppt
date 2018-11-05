package com.my.arry;

/**
 * @author 丫丫
 *					一维数组
 */
public class ArryOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a,b,c;					//数组的声明
		a = new int[]{1,2,3,4,5,6};     //数组的创建，静态初始化
		b = new int[10];						 //动态初始化
		c = new int[7];
		for(int i = 0; i < b.length; i++){
			b[i] = 2*(i-1);
		}
		c[0] = 11;
		c[3] = 5;
		c[4] = 2;
		for(int j = 0; j < b.length; j++){			//数组的遍历
			System.out.print(b[j]+"  ");
		}
		System.out.println();
		for (int n : c) {
			System.out.print(n+"  ");
		}
	}

}

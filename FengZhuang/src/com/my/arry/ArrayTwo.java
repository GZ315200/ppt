package com.my.arry;

/**
 * @author 丫丫
 *				二维数组
 */
public class ArrayTwo {
	/**
	 * @param args	二维数组
	 */
	public static void main(String[] args) {
//		创建数组
		int[][] a ,b,c,d;
		a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};//静态初始化
		b = new int[2][4];							//动态初始化
		c = new int[4][2];
		c[1][1] = 1;
		c[2][1] = 2;
		c[3][1] = 3;
		d = new int[2][];	d[0] = new int[5];	d[1] = new int[10];//数组的动态初始化
		d[0][1] = 1;
		d[1][8] = 10;
		int q = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = q++; 
				System.out.print(b[i][j]+"*");
			}			
			System.out.println();
		}
		//遍历数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}		System.out.println();

		}
		System.out.println();
//		for (int i = 0; i < b.length; i++) {
//			for (int j = 0; j < b[i].length; j++) {
//				System.out.print(b[i][j]+"*  ");
//			}
//		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+"  ");
			}
		}
		System.out.println();
		for(int i = 0; i < a.length; i++){
			for(int j : a[i]){
				System.out.print(j+"  ");
			}
		}
		System.out.println();
		for (int[] i : d) {						//二维数组增强for循环遍历
			for(int j : i){
				System.out.print(j+"  ");
			}
		}
	}
}

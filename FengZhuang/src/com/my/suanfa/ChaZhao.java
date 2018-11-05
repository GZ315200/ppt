package com.my.suanfa;
/**
 * @author 丫丫
 *	顺序查找
 */
public class ChaZhao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13};
		System.out.println(test(a,10));
		//int num;
	}
	public static int test(int[] a,int num){
		for (int i = 0; i < a.length; i++) {
			if(num == a[i]){
			//	System.out.println();
				return i;
			}
		}
		return -1;
	}
}

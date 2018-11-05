package com.my.arry;
/**
 * @author 丫丫
 *
 */
public class KeBianCanShu {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test(1,2,3);
	}
	public static void test(int ... a){	//可变参数，相当于数组
		int i = 0;
		for(int m:a ){
			System.out.print(m+"  ");
			System.out.println(m+=i);
		}
		System.out.println();
		for (int j = 0; j < a.length; j++) {
			System.out.print((i += a[j])+" ");
		}	
		
	}
}

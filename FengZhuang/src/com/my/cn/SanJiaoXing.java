package com.my.cn;
/*
 * •打印输出如下图形 
 * •   * 
 * •   ** 
 * •   *** 
 * •   **** 
 *        *
 *       **
 *      ***
 *     ****
 */
public class SanJiaoXing {

	public static void main(String[] args) {
		test();
		
		
	}
	public static void test(){
		for(int i=0; i<5; i++){
			for(int j=0; j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test2(){
		//1.共有n行  	2.第i行有n-i个空格  	3. 第i行有i个星星
	}
}

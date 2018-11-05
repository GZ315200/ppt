package com.my.zuoye;
/**
 * @author 丫丫
 *	5.打印如下形状(*号(2* i - 1)；空格：row - i)
	    *    
	   ***   
	  *****  
	 ******* 
	*********
 */
public class DaYin02 {

	public static void main(String[] args) {
		test(10);
	}
	public static void test(int row){
		for (int i = 1; i < row; i++) {
			for(int j = 1; j < row - i ; j++) {
				System.out.print(" ");			
			}
			for(int m = 0; m < 2 * i - 1; m++){
				System.out.print("#");
			}
			System.out.println();
	
		}
	}
}

package com.my.test;


public class Test {

	static int x = 3;
	static int y = 0;

	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub

		/*
		 * if (x!=3 & ++y > 0) { System.out.println("ok"+ x + y ); } else {
		 * System.out.println("NO!" + x + y);
		 * 
		 * }
		 * 
		 * if (x!=3 && ++y > 0) { System.out.println("ok"+ x + y ); } else {
		 * System.out.println("NO!" + x + y);
		 * 
		 * }
		 */

		/*int arr[][] = { { 11, 12, 13 }, { 4, 5, 6, 7 }, { 9, 8 } };
		
		boolean found = false;
		
		for (int i = 0; i < arr.length && !found; i++) {
		
			for (int j = 0; j < arr[i].length; j++) {
			
				System.out.println("i=" + i + ",j=" + j + "," + arr[i][j]);
				
				if (arr[i][j] == 5) {
				
					found = true;
					
					break;
				}
			}
		}*/

		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int sum = a + b;
		System.out.println("a="+a+",b="+b+",sum="+sum);
		
		Status status = Status.YES;
		System.out.println(status);
//		int code = Status.YES.getCode();
//		System.out.println(code);

	}

}

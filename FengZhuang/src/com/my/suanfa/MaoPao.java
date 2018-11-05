package com.my.suanfa;
/**
 * @author 丫丫
 *
 */
public class MaoPao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		test();
		}

		public static void test(){
			int[] a = {1,30,6,16,51,26,11};
			for (int i = 0; i < a.length-1; i++) {
				for (int j = 0; j < a.length - i - 1; j++) {
					if(a[j] > a[j+1]){
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
					
				}	
			}
			for (int i : a) {
				System.out.print(i+"   ");

			}
		}
}

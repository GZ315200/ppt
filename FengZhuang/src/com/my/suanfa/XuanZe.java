package com.my.suanfa;
/**
 * @author 丫丫
 *
 */
public class XuanZe {

	/**
	 * @param args	选择排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {16,5,2,19,10,3};
		test(a);
	}
	public static void test(int[] a){
		for (int i = 0; i < a.length - 1; i++) {	//
			int m = i;								//m记录最小值的下表,是第三方变量，不影响i和j
			for (int j = i+1; j < a.length; j++) {
				if(a[m] > a[j]){
					m = j;
				}
			}
			if(m != i){
				int temp = a[m];
				a[m] = a[i];
				a[i] = temp;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");

		}
	
	}

}

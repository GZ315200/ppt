package com.my.suanfa;
/**
 * @author 丫丫
 *		二分查找
 */
public class ChaZhao02 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a = {1,3,5,7,9,11};
		
		
		System.out.println(test(a,5));
	}
	
	public static int test(int[] a,int num){
		int start = 0;
		int end = a.length-1;
		while(start <= end){
			int middle = (start + end)/2;

			if(num == a[middle]){
				return middle;
			}else if(num < a[middle]){
				end = middle - 1;
			}else if(num > a[middle]){
				start = middle + 1;
			}
		}
		
		return -1;
	}
	
}

package com.my.suanfa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,7,2,9,1,8};
		run(a);
	}
	
	public static void run(int[] a){
		for (int i = 0; i < a.length; i++) {
			int num = i;	//假设啊a[0]是最小数，用num记录最小至的下标
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[num]){
					num = j;
				}
			}
			if(num != i){
				int temp = a[i];
				a[i] = a[num];
				a[num] = temp;
				
			}
			
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

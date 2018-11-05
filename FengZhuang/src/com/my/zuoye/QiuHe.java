package com.my.zuoye;
/**
 * @author 丫丫
 *	1、编写一个方法，输入n为偶数时，调用方法求1/2+1/4+…..+1/n,当输入n为奇数时，调用方法为,1/1+1/3+…..+1/n;
 */
public class QiuHe {
	/**
	 * @param args
	 */
    double n;
	static double sum = 0;
	public static void main(String[] args) {		
		System.out.println(oushu(10));
	}
	public static  double oushu(double n){
//		for (double i = 1; i < n; i++) {
//			if(i % 2 == 0){
//				sum += 1/i;
//			}else{
//				sum += 1/i;
//			}			
//		}
		if(n % 2 == 0){
			for (double i = 2.0; i <= n; i+=2) {
				sum += 1/i;
			}
		}else{
			for (double i = 1.0; i <= n; i+=2) {
				sum += 1/i;
			}
		}
		return sum;
	}
}
//while(n % 2 == 0){
//sum += 1/n;
//n += 2;
//}


package com.my.zuoye;

/**
 * @author 丫丫 2.判断111是否为素数(质数)。所谓质数是指只能被1和它自己整除的自然数。
 */
public class ZhiShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test(111);
	}

	public static void test(int a) {
		int num=111;
		boolean f=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0){
				f=true;
				break ;
			}
			
		}
		if(f){
			System.out.println(num+"不是素数");
		}else{
			System.out.println(num+"是素数");
		}

		}

	}


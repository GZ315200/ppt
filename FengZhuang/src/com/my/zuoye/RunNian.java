package com.my.zuoye;

/**
 * @author 丫丫
 *
 *1. 判断2008年是闰年还是平年。闰年的条件:
	   能被4整除且不能被100整除的数,
	   或者能被400整除的数。
 */
public class RunNian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 2008;
		if((n%4 == 0 && n%100 != 0 )||n%400 ==0){
			System.out.println(n+"是闰年");
		}else{
			System.out.println(n+"是平年");
		}
	}

}

package com.my.zuoye;
/**
 * @author 丫丫
 *3.用循环的方式输出九九乘法表，如下：
  1*1=1
  1*2=2 2*2=4
  1*3=3 2*3=6 3*3=9
  ...
  1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81

 */
public class ChengFaBiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		for (int i = 1; i < 10; i++) {//System.out.println();
			for (int j = 1; j <= i; j++) {//   j = i; j < 10 ; j++
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				
			}System.out.println();
		}
	}

}

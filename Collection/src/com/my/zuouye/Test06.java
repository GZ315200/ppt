package com.my.zuouye;

import java.util.Random;

/**
 * @author 丫丫
 * 	
	六. 编写一个Java方法，生成5个不重复的英文小写字母，并按字母顺序排列好。
	  1) 生成a-z的随机字母  
	  2) 5个不重复的
	  3) 排序
 */
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		//char[] c = {'a','b','c','d','e','f','g',};
		String src = "abcdefghijklmnopqrstuvwxyz";
		char[] c = src.toCharArray();
		String a = "";
		int count = 0;
		char ch=c[r.nextInt(26)];
		while(true){
			if(a.indexOf(ch)==-1){
				a+=ch;
				count++;
			}
			if(count>=5){
				break;
			}
		}
	}

}

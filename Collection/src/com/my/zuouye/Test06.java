package com.my.zuouye;

import java.util.Random;

/**
 * @author ѾѾ
 * 	
	��. ��дһ��Java����������5�����ظ���Ӣ��Сд��ĸ��������ĸ˳�����кá�
	  1) ����a-z�������ĸ  
	  2) 5�����ظ���
	  3) ����
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

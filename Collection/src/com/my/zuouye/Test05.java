package com.my.zuouye;
/**
 * @author ѾѾ
 *	1. �ַ���������
	  1) ��дһ������public static int count(String src, String key),  ��src�����в��ҳ�key�ĳ��ִ�����
	          �磺Դ��Ϊ"String testString testString stringtestString abctest"�����ҡ�test��ʱӦ�÷���4��
	
	  2) ��дһ������public String initcap(String source);  ��src�����е�ÿ�����ʵ�����ĸ�ĳɴ�д���������䡣

 */
public class Test05 {
	
	
	public static int count(String src, String key){
		String d = src.replaceAll(key, "");
		
		return (src.length()-d.length())/4;
		
	}
	public static String initcap(String src){
		String[] a = src.split(" ");
		String b =""; 
		
		for (int i = 0; i < a.length; i++) {
			b += a[i].substring(0, 1).toUpperCase()+a[i].substring(1, a[i].length())+" ";
		}
//			System.out.println(b);
//		src.replaceFirst(regex, replacement)
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String src = "String testString testString stringtestString abctest";
	String key = "test";
	System.out.println(count(src,key));
	System.out.println(initcap(src));
	}

}

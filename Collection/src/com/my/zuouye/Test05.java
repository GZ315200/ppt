package com.my.zuouye;
/**
 * @author 丫丫
 *	1. 字符串操作：
	  1) 编写一个方法public static int count(String src, String key),  从src内容中查找出key的出现次数：
	          如：源串为"String testString testString stringtestString abctest"，查找“test”时应该返回4。
	
	  2) 编写一个方法public String initcap(String source);  把src内容中的每个单词的首字母改成大写，其它不变。

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

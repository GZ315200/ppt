package com.my.test;

public class NumberWrap {
	public static void main(String[] args) {
		String str = null;
		if (args.length == 0) {
			System.out.println("无传入的参数,请传入参数");
		} else {
			str = args[0];
			str = args[1];
			// ------------- String转换成Ingeter
//			Integer integer = new Integer(str); // 方式一

			 Integer integer = Integer.valueOf(str); // 方式二
			System.out.println(integer.equals(integer));
			
			
			// -------------Ingeter转换成String
			String str2 = integer.toString();

			// ------------- 把Ingeter转换成int
			int i = integer.intValue();
			System.out.println(Integer.valueOf(str2).intValue() == i);
			
			// ------------- 把int转换成Integer
			Integer integer2 = new Integer(i);//

			// Integer integer2 = Integer.valueOf(i);
			// ------------- String转换成int
			int i2 = Integer.parseInt(str2);
			System.out.println(i2);
			// ------------- 把int转换成String
			String str3 = String.valueOf(i2); // 方式一
			String str4 = i2 + ""; // 方式二
		}
	}
}
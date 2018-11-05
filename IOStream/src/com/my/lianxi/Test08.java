package com.my.lianxi;

import java.io.File;
import java.io.IOException;

/**
 * @author 丫丫
 *	8、 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，
 *	在创建一个目录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；
 *	之后遍历IOTest这个目录下的文件
 */
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		int a = 123;
	}
	public static void test(){
		File file1 = new File("E:/yaya/HelloWorld.txt");
		File file2 = new File("E:/yaya/IOTest");
		try {
			System.out.println(file1.exists()?"文件已存在":file1.createNewFile());
			System.out.println(file1.isDirectory()?"是目录":"是文件");
			
			System.out.println(file2.exists()?"文件已存在":file2.mkdirs());
			
			
			
		//	file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

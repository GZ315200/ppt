package com.my.lianxi;

import java.io.File;
import java.io.IOException;

/**
 * @author ѾѾ
 *	8�� �ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ����ж������ļ�����Ŀ¼��
 *	�ڴ���һ��Ŀ¼IOTest,֮��HelloWorld.txt�ƶ���IOTestĿ¼��ȥ��
 *	֮�����IOTest���Ŀ¼�µ��ļ�
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
			System.out.println(file1.exists()?"�ļ��Ѵ���":file1.createNewFile());
			System.out.println(file1.isDirectory()?"��Ŀ¼":"���ļ�");
			
			System.out.println(file2.exists()?"�ļ��Ѵ���":file2.mkdirs());
			
			
			
		//	file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

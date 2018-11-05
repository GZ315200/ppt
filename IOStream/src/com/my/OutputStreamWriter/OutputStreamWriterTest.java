package com.my.OutputStreamWriter;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author 丫丫
 *	1、定义一个变量String  str ="中华人民共和国" ;
 *   以字节流的方式 写入c:/aaa.txt
 */
public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		OutputStreamWriter osw = null;
		String str = "中华人民共和国";

		try {
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("E:/yaya/aaa.txt")));
		
			osw.write(str);
			osw.flush();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

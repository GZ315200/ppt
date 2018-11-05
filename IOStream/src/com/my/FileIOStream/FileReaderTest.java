package com.my.FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 丫丫
 *	用字节流去读取字符流   中文在控制台输出为乱码
 */
public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("E:/yaya/a.txt");
			fos = new FileOutputStream("E:/yaya/a1.txt");
			int b = 0;
			while((b = fis.read()) != -1){
				System.out.print((char)b);
				fos.write(b);
			}
			fos.flush();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

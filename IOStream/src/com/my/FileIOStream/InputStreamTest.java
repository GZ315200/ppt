package com.my.FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
	}

	public static void test(){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("E:/yaya/48.jpg");
			fos = new FileOutputStream("E:/yaya/480.jpg");
			
			int b = 0;
			byte[] by = new byte[8192];
			while((b = fis.read(by)) != -1){
				fos.write(by, 0, b);
				
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

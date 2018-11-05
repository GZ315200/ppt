package com.my.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ñ¾Ñ¾
 *	×Ö·û×ª»»Á÷
 */
public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
//		FileReader fr = new FileReader(isr);
		InputStreamReader isr = null;
//		InputStreamReader fr = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream("E:/yaya/a.txt"));
			
			int b = 0;
			while((b = isr.read()) != -1){
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

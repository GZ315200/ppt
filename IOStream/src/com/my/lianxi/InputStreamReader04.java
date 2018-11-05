package com.my.lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author 丫丫
 *	4.用转换流实现文本文件复制的功能.
 */
public class InputStreamReader04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
//		isr = new BufferedReader(new InputStreamReader(new FileInputStream("")));
		try {
			isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("E:/yaya/aaa.txt")));
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("E:/yaya/bbb.txt")));
		
			int b = 0;
			while((b = isr.read()) != -1){
				osw.write(b);
			}
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
				isr.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

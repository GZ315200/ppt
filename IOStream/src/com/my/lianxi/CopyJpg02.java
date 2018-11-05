package com.my.lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 丫丫
 *	2、使用缓冲字节流实现图片的复制
 */
public class CopyJpg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("E:/yaya/48.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("E:/yaya/4800.jpg"));
			
			int b= 0;
			while((b = bis.read()) != -1){
				bos.write(b);
			}
			bos.flush();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

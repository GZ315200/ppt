package com.my.lianxi;
/**
 * 1.用缓冲流实现MP3复制的功能.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("E:/yaya/telephone.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("E:/yaya/t1.mp3"));
			
			int b = 0;
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

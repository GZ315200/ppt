package com.my.lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 丫丫
 *	 7、使用转换流把用户输入数据输出到c:/aaa.txt中  
 */
public class SystemIn07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
//		InputStreamReader isr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
//		isr = new InputStreamReader((System.in));
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			bw = new BufferedWriter(new FileWriter("E:/yaya/b.txt"));
			
			String b = "";
			while((b = br.readLine()) != null){
				if(b.equals("退出")){
					break;
				}
				bw.write(b+System.getProperty("line.separator"));
				bw.flush();
				

			}
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

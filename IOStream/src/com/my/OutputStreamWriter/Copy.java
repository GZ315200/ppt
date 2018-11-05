package com.my.OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	public static void test(){
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		isr = new InputStreamReader(System.in);
		try {
			osw = new OutputStreamWriter(new FileOutputStream("E:/yaya/b.txt"));
			
			int b = 0;
			while((b = isr.read()) != -1){
				osw.write(b);
				if(b == 'u'){
					break;
				}
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

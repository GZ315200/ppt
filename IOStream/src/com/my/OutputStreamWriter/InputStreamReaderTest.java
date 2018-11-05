package com.my.OutputStreamWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		InputStreamReader isr = null;
		BufferedWriter bw = null;
		
	 
		isr=new InputStreamReader(System.in);
		try {
			bw = new BufferedWriter(new FileWriter("E:/yaya/b.txt"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int b = 0;
		try {
			while((b = isr.read()) != -1){
//				System.out.print("only you can let us go!");
				//System.out.print((char)b);
				if(b == 'u'){
					break;
				}
				bw.write(b);
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				isr.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

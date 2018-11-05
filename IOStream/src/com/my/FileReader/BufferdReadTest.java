package com.my.FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
	}

	public static void test(){
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("E:/yaya/f.txt"));
			bw = new BufferedWriter(new FileWriter("E:/yaya/f1.txt"));
			String str = "";
			while((str = br.readLine()) != null){
				bw.write(str);
			}
			bw.flush();
			System.out.println("ok");
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

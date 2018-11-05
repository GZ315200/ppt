package com.my.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:/yaya/a.txt");
		
		FileReader fr = null;
		int c = 0;
		char[] ch = new char[16];
		try {
			fr = new FileReader(f);
			
			while((c = fr.read(ch))!= -1){
				for (int i = 0; i < c; i++) {
					System.out.print(ch[i]);
				}
		//		System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

	}

}

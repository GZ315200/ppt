package com.my.FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("E:/yaya/a.txt");
			fw = new FileWriter("E:/yaya/f.txt");
			
			int c = 0;
			char[] ch = new char[2];
			
			while((c = fr.read(ch)) != -1){
				for (int i = 0; i < c; i++) {
					System.out.print(ch[i]);
					fw.write(ch[i]);

				}
			}
//			fw.write(ch);
			fw.flush();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

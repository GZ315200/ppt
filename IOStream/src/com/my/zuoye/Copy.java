package com.my.zuoye;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy.copy();
	}
	public static void copy(){
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("E:/yaya/a.txt");
			fw = new FileWriter("E:/yaya/f.txt",true);
			
			int a = 0;
			char[] ch = new char[2014];
			while((a = fr.read(ch)) != -1){
				System.out.println();
				for (int i = 0; i < a; i++) {
					System.out.print(ch[i]);
//					fw.write(ch[i]);
				}
				fw.write(ch, 0, a);
			}
//			fw.write(ch);  复制结果可能会出错
			fw.flush();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

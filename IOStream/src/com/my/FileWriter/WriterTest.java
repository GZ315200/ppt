package com.my.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "你存在我深深的脑海里，我的心里，我的梦里，我的歌声里~~~~~~~";
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("E:/yaya/f.txt");
			fw.write(a);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

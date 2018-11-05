package com.my.OutputStreamWriter;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ѾѾ
 *	1������һ������String  str ="�л����񹲺͹�" ;
 *   ���ֽ����ķ�ʽ д��c:/aaa.txt
 */
public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test(){
		OutputStreamWriter osw = null;
		String str = "�л����񹲺͹�";

		try {
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("E:/yaya/aaa.txt")));
		
			osw.write(str);
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
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

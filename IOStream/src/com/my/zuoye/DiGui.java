package com.my.zuoye;
/**
 * •用递归算法列出指定目彔下的所有子孙文件和目彔 
 * public static int test(int a){
		int sum = 0;
		if(a == 1 || a ==2){
			return 1;
		}else{
			sum = test(a-1)+test(a-2);
			return sum;
	}}
 */
import java.io.File;

public class DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("E:/yaya");
//		play(file);
		System.out.println(play(file));
	}

//	public static void play(File file){
	public static Object play(File file){	 
		if(!file.isDirectory()){
					
			Object b=(Object)file.getName();
			return b;
//			System.out.println(b);
		}
		else{
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				play(files[i]);
//				return files[i];
//				System.out.println(files[i]);

			}
			return files;

		}
		
	}
}

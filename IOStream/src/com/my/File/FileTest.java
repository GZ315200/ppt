package com.my.File;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:/yaya/a.txt");
		
		System.out.println("文件是否存在"+f.exists());
		System.out.println("获取文件绝对路径"+f.getAbsolutePath());
		System.out.println("是否为目录"+f.isDirectory());
		System.out.println("获取文件名"+f.getName());
		System.out.println("获取文件字符长度"+f.length());
		System.out.println("文件是否可读"+f.canRead());
		System.out.println("文件是否可写"+f.canWrite());
		System.out.println("文件是否存在"+f.exists());
		System.out.println(""+f.isFile());//true
		System.out.println("是否为隐藏文件"+f.isHidden());
		System.out.println("最后一次修改的毫秒值"+f.lastModified());//
		System.out.println("绝对路径"+f.getPath());
		System.out.println(""+f.getParentFile());
		System.out.println(""+f.getParent());
		System.out.println(""+f.toURI());
		try {
			System.out.println(""+f.getCanonicalPath());
			System.out.println(""+f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
}

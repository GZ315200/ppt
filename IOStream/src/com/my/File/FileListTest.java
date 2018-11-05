package com.my.File;
/**
 * 列出指定目彔下的jpg类型图片
 */
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public abstract class FileListTest implements FilenameFilter{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:/yaya");
		
		File[] f1 = f.listFiles();
		
		for (int i = 0; i < f1.length; i++) {
			//File f2 = f1.
			if(f1[i].getName().endsWith(".jpg")){
				System.out.println(f1[i]);
			}
		}
		//过滤器遍历文件后缀名
		File[] f2 = f.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if(name.endsWith(".jpg")){
					return true;
				}
				return false;
			}
		});
		System.out.println("============过滤器===============");
		for (File file : f2) {
			System.out.println(file);
		}
		try {
			System.out.println((f.createNewFile()?"创建成功":"创建失败"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

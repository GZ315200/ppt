package com.my.File;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("E:/yaya/a.txt");
		
		System.out.println("�ļ��Ƿ����"+f.exists());
		System.out.println("��ȡ�ļ�����·��"+f.getAbsolutePath());
		System.out.println("�Ƿ�ΪĿ¼"+f.isDirectory());
		System.out.println("��ȡ�ļ���"+f.getName());
		System.out.println("��ȡ�ļ��ַ�����"+f.length());
		System.out.println("�ļ��Ƿ�ɶ�"+f.canRead());
		System.out.println("�ļ��Ƿ��д"+f.canWrite());
		System.out.println("�ļ��Ƿ����"+f.exists());
		System.out.println(""+f.isFile());//true
		System.out.println("�Ƿ�Ϊ�����ļ�"+f.isHidden());
		System.out.println("���һ���޸ĵĺ���ֵ"+f.lastModified());//
		System.out.println("����·��"+f.getPath());
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

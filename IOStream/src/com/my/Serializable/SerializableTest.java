package com.my.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 丫丫 序列化反序列化
 */
public class SerializableTest  {

	/**
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People("aaa", 148561, 23.5, 3);
		serialize(p1);
		deserialize(p1);
	}

	public static void serialize(People p1) { // 序列化
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:/yaya/people.txt"));
			oos.writeObject(p1);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void deserialize(People p1) {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("E:/yaya/people.txt"));
			People p2 = (People) ois.readObject();
			System.out.println(p2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.my.common;

import java.io.IOException;
import java.util.Properties;

public class DaoFactory {

	private static Properties prop = new Properties();
	static {
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("EmployeeDao.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("在classpath下未找到dao.properties文件，请检查！");
			e.printStackTrace();
		}
	}

	private DaoFactory() {
	}
	public static Object getInstance(String daoName){
		Object obj = null;
		String ClassName = prop.getProperty(daoName);
		
		try {
			obj = Class.forName(ClassName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
		
	}
}

/**
 * * 根据传递的dao名称创建出它的实现类的实例 
 * * @param daoName 在dao.properties文件中配置的dao名
 * * @return
 * 成功，返回实现类的实例。否则,返回null
 *  public static Object getInstance(String daoName){
 * 		Object obj = null; //根据传递过来的dao名称从属性集中获取它对应的类的全限定名
 * 		 String className =props.getProperty(daoName); 
 *  //根据“类的全限定名”来创建出一个实例 --->反射技术
 *   try {
 * //加载指定的字节码，并调用它的默认构造方法来创建出一个实例 
 * obj = Class.forName(className).newInstance();
 * } catch (Exception e) { e.printStackTrace(); } return obj; } 
 * 
 * 
 * 
 */

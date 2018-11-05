package com.my.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream ip = Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.properties");
		
		
		Properties p = new Properties();
		
		try {
			p.load(ip);
			System.out.println(p.getProperty("loginname")+"\n"+p.getProperty("password"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

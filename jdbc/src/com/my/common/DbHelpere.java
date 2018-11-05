package com.my.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 自定义工具类
 * @author 丫丫
 * 
 */
public class DbHelpere {

	private DbHelpere() {		//防止对外创建对象
	}
	private static Properties prop =  new Properties();

	static {											//加载属性部署.properties文件
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
		} catch (IOException e) {
			System.out.println("要加载的文件不存在或路径名不对!");
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection conn = null;
		/*
		String url = "jdbc:mysql://localhost:3306/test";// •步骤二：提供连接参数
		String user = "root";
		String password = "root";
		*/
		try {
			/*
			Class.forName("com.mysql.jdbc.Driver");// •步骤一：加载JDBC驱动程序
			conn = DriverManager.getConnection(url, user, password); // •步骤三：建立一个数据库的连接
			*/
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),prop.getProperty("password"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void close(PreparedStatement pstat) {
		if (pstat != null) {
			try {
				pstat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn, PreparedStatement pstat, ResultSet rs) {
		close(conn);
		close(pstat);
		close(rs);
	}

	public static void close(Connection conn, PreparedStatement pstat) {
		close(conn);
		close(pstat);
	}
}

package com.my.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.DuplicateFormatFlagsException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * 自定义工具类
 * @author 丫丫
 * 
 */
@SuppressWarnings("unused")
public class DbHelper {

	private DbHelper() {		//防止对外创建对象
	}
	private static Properties prop = new Properties();
	private static DataSource ds = null;
	static {											//加载属性部署.properties文件
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
			ds = DruidDataSourceFactory.createDataSource(prop);
		} catch (IOException e) {
			System.out.println("要加载的文件不存在或路径名不对!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			/*
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),prop.getProperty("password"));//Dao工厂
			*/
			conn = ds.getConnection();
		}
//			catch (ClassNotFoundException e){
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/*
	 * public static void close(Connection conn) { if (conn != null) try {
	 * conn.close(); } catch (SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 * 
	 * public static void close(PreparedStatement pstat) { if (pstat != null) {
	 * try { pstat.close(); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } } }
	 * 
	 * public static void close(ResultSet rs) { if (rs != null) { try {
	 * rs.close(); } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 * 
	 * public static void close(Connection conn, PreparedStatement pstat,
	 * ResultSet rs) { close(rs); close(pstat); close(conn); }
	 * 
	 * public static void close(PreparedStatement pstat, Connection conn) {
	 * close(pstat); close(conn);
	 * 
	 * }
	 */
}

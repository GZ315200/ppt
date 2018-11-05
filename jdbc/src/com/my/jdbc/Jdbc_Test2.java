package com.my.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Jdbc_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stu =  jdbc_Query(1001);
			for (Student student : stu) {
				System.out.println(student);
			}
	}

	public static List<Student> jdbc_Query(int id) { // 查
		List<Student> stuSet = new ArrayList<Student>();
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet result = null;

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL"; // •步骤二：提供连接参数
		String user = "scott";
		String password = "tiger";
		
		String sql = "select sid,sname,gender,age,brithday from stu where sid = ? ";
		System.out.println(sql);
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // •步骤一：加载JDBC驱动程序

			conn = DriverManager.getConnection(url, user, password); // •步骤三：建立一个数据库的连接

			pstat = conn.prepareStatement(sql); // •步骤四：创建一个statement
			pstat.setInt(1, id);
			result = pstat.executeQuery(); // •步骤五：执行SQL语句
			
			while (result.next()) {// •步骤六：处理结果

				int i = 1;
				Student stu = new Student();
				stu.setSid(result.getInt(i++));
				stu.setSname(result.getString(i++));
				stu.setGender(result.getString(i++));
				stu.setAge(result.getInt(i++));
				stu.setBrithday(result.getTimestamp(i++));
				stuSet.add(stu);
			}

			// System.out.println("已执行"+"\n"+result);
			// result.getInt(columnIndex);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // qi
			try {// •步骤七：关闭JDBC对象

				if (result != null) {
					result.close();
				}
				if (pstat != null) {
					pstat.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return stuSet;
	}
}

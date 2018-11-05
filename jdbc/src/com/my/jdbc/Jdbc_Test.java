package com.my.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author 丫丫
 * Statement依赖注入
 */

public class Jdbc_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student stu = new Student(1002, "二二", "男", 28,new Date());
//		jdbc_delete();		已执行删除STU表
//		jdbc_insert(stu);	//增加字段
		jdbc_update();
		List<Student> stuSet= jdbc_Query();
		for (Student student : stuSet) {
			System.out.println(student);
		}
	}
	public static void jdbc_insert(Student stu){
		Connection conn = null;
		Statement stat = null;
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";	//er
		String user = "scott";
		String password = "tiger";
		String sql = "insert into stu(sid,sname,gender,age,brithday) values("+stu.getSid()+",'"+stu.getSid()+"','"+stu.getGender()+"',"+stu.getAge()+",sysdate)";
		System.out.println(sql);
		try {
			Class.forName("oracle.jdbc.OracleDriver");				//yi
			conn = DriverManager.getConnection(url, user,password);		//san
			stat = conn.createStatement();							//si
			int rows = stat.executeUpdate(sql);								//wu
			System.out.println("已执行"+rows+"条语句！");
		//	result.getInt(columnIndex);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stat != null){
					stat.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void jdbc_delete(){
		Connection conn = null;
		Statement stat = null;
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";	//二
		String user = "scott";
		String password = "tiger";
		String sql = "drop table stu purge";
		try {
			Class.forName("oracle.jdbc.OracleDriver");				//一
			conn = DriverManager.getConnection(url, user,password);		//三
			stat = conn.createStatement();							//四
			int rows = stat.executeUpdate(sql);								//五
			System.out.println("已执行"+rows+"条语句！");
		//	result.getInt(columnIndex);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stat != null){
					stat.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void jdbc_update(){	//改
		Connection conn = null;
		Statement stat = null;
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";	//二
		String user = "scott";
		String password = "tiger";
		String sql = "update stu set sname = '丫丫',gender = 'nv',age = 22, brithday = sysdate where sid = 1001";
		System.out.println(sql);
		try {
			Class.forName("oracle.jdbc.OracleDriver");				//一
			conn = DriverManager.getConnection(url, user,password);		//三
			stat = conn.createStatement();							//四
			int rows = stat.executeUpdate(sql);								//五、六
			System.out.println("已执行"+rows+"条语句！");
		//	result.getInt(columnIndex);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stat != null){
					stat.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static List<Student> jdbc_Query(){	//改
		List<Student> stuSet = new ArrayList<Student>();
		Connection conn = null;
		Statement stat = null;
		ResultSet result = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";	// •步骤二：提供连接参数
		String user = "scott";
		String password = "tiger";
		
		String sql = "select sid,sname,gender,age,brithday from stu";
		System.out.println(sql);
		try {
			Class.forName("oracle.jdbc.OracleDriver");				//•步骤一：加载JDBC驱动程序 
			conn = DriverManager.getConnection(url, user,password);		//•步骤三：建立一个数据库的连接

			stat = conn.createStatement();							//•步骤四：创建一个statement 

			result = stat.executeQuery(sql);						//•步骤五：执行SQL语句 

			/*
			while (result.next()) {									//liu
				System.out.println(result.getString(1).toString()+result.getString(2).toString()+result.getString(3).toString()
						+result.getString(4).toString()+result.getString(5).toString());
			}*/
			
			while(result.next()){// •步骤六：处理结果

				int i = 1;
				Student stu = new Student();
				stu.setSid(result.getInt(i++));
				stu.setSname(result.getString(i++));
				stu.setGender(result.getString(i++));
				stu.setAge(result.getInt(i++));
				stu.setBrithday(result.getTimestamp(i++));
				stuSet.add(stu);
			}
			
//			System.out.println("已执行"+"\n"+result);
		//	result.getInt(columnIndex);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{								//qi
			try {//  •步骤七：关闭JDBC对象 

				if(result != null){
					result.close();
				}
				if(stat != null){
					stat.close();
				}
				if(conn != null){
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

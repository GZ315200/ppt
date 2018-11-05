package com.my.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.my.oracle.entity.Stu_Bean;

public class Oracle_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comm(sql);
		
		Stu_Bean bean = new Stu_Bean();
		bean.setSid(1012);
		bean.setSname("火火火");
		bean.setAge(12);
		bean.setGender("男");
		bean.setBrithday(new Date());
		add(bean);
		
//		update(bean);
//		delete(1001);
//		List<Stu_Bean> slist = findAll();
//		List<Stu_Bean> slist = findAByName("火");
	
//		for (Stu_Bean stu : slist) {
//			System.out.println(stu);
//		}
		
//		Stu_Bean stu = findAById(1011);
//		System.out.println(stu);
	}

	public static void update(Stu_Bean bean) {

		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";

		String sql = "update stu set sid=" + bean.getSid() + ", sname='" + bean.getSname() + "', age="
				+ bean.getAge() + ", gender='" + bean.getGender() + "' where sid = 1002";

		Connection conn = null;
		Statement stat = null;
		int row = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stat = conn.createStatement();
			row = stat.executeUpdate(sql);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("成功修改" + row + "条数据");
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void add(Stu_Bean bean) {

		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
//		String sql = "insert into stu(sid,sname,age,gender,brithday) values(" + bean.getSid() + "," + "'"
//				+ bean.getSname() + "'," + bean.getAge() + ",'" + bean.getGender() + "',sysdate)";

		String sql = "insert into stu(sid,sname,age,gender,brithday) values(?,?,?,?,?)";
		
		Connection conn = null;
//		Statement stat = null;
		PreparedStatement pstat = null;
		
		int row = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
//			stat = conn.createStatement();
//			row = stat.executeUpdate(sql);
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setInt(1, bean.getSid());
			pstat.setString(2, bean.getSname());
			pstat.setInt(3, bean.getAge());
			pstat.setString(4, bean.getGender());
			pstat.setTimestamp(5, new Timestamp(bean.getBrithday().getTime()));
			
			row = pstat.executeUpdate();
			System.out.println("ok");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("成功修改" + row + "条数据");
			if (pstat != null) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void delete(int id) {

		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String sql = "delete from stu where sid ="+id;
		Connection conn = null;
		Statement stat = null;
		int row = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stat = conn.createStatement();
			row = stat.executeUpdate(sql);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("成功修改" + row + "条数据");
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static List<Stu_Bean> findAll(){
		
		List<Stu_Bean> sList = new ArrayList<>();
		
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String sql = "select sid,sname,age,gender,brithday from stu";
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
		
			while (rs.next()) {
				/*System.out.println("sid :" + rs.getInt(i++) + "sname :" + rs.getString(i++) + "age :"
				+ rs.getInt(i++) + "gender :" + rs.getString(i++) + "brithday :"+rs.getTimestamp(i++));
				System.out.println("ok"); */
				Stu_Bean stu = new Stu_Bean();
				int i = 1;

				stu.setSid(rs.getInt(i++));
				stu.setSname(rs.getString(i++));
				stu.setAge(rs.getInt(i++));
				stu.setGender(rs.getString(i++));
				stu.setBrithday(rs.getTimestamp(i++));
				sList.add(stu);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sList;
	}
	
	public static List<Stu_Bean> findAByName(String name){
		
		List<Stu_Bean> sList = new ArrayList<>();
		
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String sql = "select sid,sname,age,gender,brithday from stu where sname like '%" + name + "%'";
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
		
			while (rs.next()) {
				/*System.out.println("sid :" + rs.getInt(i++) + "sname :" + rs.getString(i++) + "age :"
				+ rs.getInt(i++) + "gender :" + rs.getString(i++) + "brithday :"+rs.getTimestamp(i++));
				System.out.println("ok"); */
				Stu_Bean stu = new Stu_Bean();
				int i = 1;

				stu.setSid(rs.getInt(i++));
				stu.setSname(rs.getString(i++));
				stu.setAge(rs.getInt(i++));
				stu.setGender(rs.getString(i++));
				stu.setBrithday(rs.getTimestamp(i++));
				sList.add(stu);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sList;
	}
	
	public static Stu_Bean findAById(int id){
		
//		List<Stu_Bean> sList = new ArrayList<>();
		
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String sql = "select sid,sname,age,gender,brithday from stu where sid = ?";
		
		Connection conn = null;
//		Statement stat = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Stu_Bean stu = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
//			stat = conn.createStatement();
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			rs = pstat.executeQuery();

		
			while (rs.next()) {
				/*System.out.println("sid :" + rs.getInt(i++) + "sname :" + rs.getString(i++) + "age :"
				+ rs.getInt(i++) + "gender :" + rs.getString(i++) + "brithday :"+rs.getTimestamp(i++));
				System.out.println("ok"); */
				
				stu = new Stu_Bean();
				int i = 1;

				stu.setSid(rs.getInt(i++));
				stu.setSname(rs.getString(i++));
				stu.setAge(rs.getInt(i++));
				stu.setGender(rs.getString(i++));
				stu.setBrithday(rs.getTimestamp(i++));
//				sList.add(stu);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstat != null) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return stu;
	}
	
	
}

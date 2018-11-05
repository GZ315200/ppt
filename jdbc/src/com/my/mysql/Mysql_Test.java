package com.my.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.my.oracle.entity.Stu_Bean;

public class Mysql_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Stu_Bean stu = new Stu_Bean(1106, "武娟1", 24, "女", new Date());
//		 add(stu);
//		 System.out.println(stu);

		// delete(1111);
//		update(stu);
//		List<Stu_Bean> sList = findAll();
//		for (Stu_Bean s : sList) {
//			System.out.println(s);
//		}
		 for (int i = 3000; i < 50; i++) {

			 Stu_Bean stu1 = new Stu_Bean(i, "张", i-2900, "男", new Date());
			 add(stu1);
		}
	}

	// add
	public static void add(Stu_Bean stu) {

		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";

		String sql = "insert into stu(sid,sname,age,gender,brithday) values(?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstat = null;
		int row = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstat = conn.prepareStatement(sql);

			pstat.setInt(1, stu.getSid());
			pstat.setString(2, stu.getSname());
			pstat.setInt(3, stu.getAge());
			pstat.setString(4, stu.getGender());
			pstat.setTimestamp(5, new Timestamp(stu.getBrithday().getTime()));

			row = pstat.executeUpdate();
			System.out.println("成功添加" + row + "行数据 ！");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pstat) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// delete
	public static void delete(int id) {
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";

		String sql = "delete from stu where sid = ?";

		Connection conn = null;
		PreparedStatement pstat = null;
		int row = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstat = conn.prepareStatement(sql);

			pstat.setInt(1, id);
			row = pstat.executeUpdate();
			System.out.println("删除OK");

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pstat) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// update
	public static void update(Stu_Bean stu) {
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";

		String sql = "update stu set sname = ?, age = ?, gender = ?, brithday = ? where sid = ?";

		Connection conn = null;
		PreparedStatement pstat = null;
		int row = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstat = conn.prepareStatement(sql);

			pstat.setString(1, stu.getSname());
			pstat.setInt(2, stu.getAge());
			pstat.setString(3, stu.getGender());
			pstat.setTimestamp(4, new Timestamp(stu.getBrithday().getTime()));
			pstat.setInt(5, stu.getSid());

			row = pstat.executeUpdate();
			System.out.println("修改ok!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pstat) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (null != conn) {
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	// find
	public static List<Stu_Bean> findAll() {

		List<Stu_Bean> sList = new ArrayList<>();

		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";

		String sql = "select sid,sname, age, gender, brithday from stu";

		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);

			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();


			while (rs.next()) {

				Stu_Bean s = new Stu_Bean();
				int i = 1;

				/*pstat.setInt(i++, stu.getSid());
				pstat.setString(i++, stu.getSname());
				pstat.setInt(i++, stu.getAge());
				pstat.setString(i++, stu.getGender());
				pstat.setTimestamp(i++, new Timestamp(stu.getBrithday().getTime()));*/

				s.setSid(rs.getInt(i++));
				s.setSname(rs.getString(i++));
				s.setAge(rs.getInt(i++));
				s.setGender(rs.getString(i++));
				s.setBrithday(rs.getDate(i++));
				
				sList.add(s);

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != rs) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != pstat) {
				try {
					pstat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != conn) {
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
}

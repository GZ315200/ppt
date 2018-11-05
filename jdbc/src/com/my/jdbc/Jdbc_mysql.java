package com.my.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.my.common.DbHelpere;
import com.my.common.Db_Test;

public class Jdbc_mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dept = new Dept(1000020, "张三", "10部门", new Date());
		add(dept);
	}
	static PreparedStatement pstat = null;
	static Connection conn = DbHelpere.getConnection();

	public static void add(Dept dept) {

		String sql = "insert into dept(id,name,description,created_time) values(?,?,?,?)";
		try {
			pstat = conn.prepareStatement(sql); // •步骤四：创建一个statement
			pstat.setInt(1, dept.getId());
			pstat.setString(2, dept.getName());
			pstat.setString(3, dept.getDescription());
			pstat.setTimestamp(4, new Timestamp(dept.getCreated_time().getTime()));
			int rows = pstat.executeUpdate();
			System.out.println("已执行" + rows + "条语句！");

			// pstat.setDate(4, new datetime(dept.getCreated_time().getTime()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbHelpere.close(conn, pstat);
		}
	}
	
	public static void delete(int id){
		
		String sql = "delete from stu where sid = ?";
		
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			int row = pstat.executeUpdate();
			System.out.println("成功删除"+row+"行语句！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Db_Test.closed(pstat, conn);
		}
		
		
	};
}

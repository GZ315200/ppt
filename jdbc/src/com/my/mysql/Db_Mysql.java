package com.my.mysql;

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

import com.my.common.Db_Test;
import com.my.common.Page;
import com.my.oracle.entity.Stu_Bean;

public class Db_Mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Stu_Bean stu = new Stu_Bean(2004, "钱4", "男", 1, new Date());
//		 save(stu);
//		 delete(2001);
		// update(stu);
		
//		List<Stu_Bean> sl = findAByName("武");
//		for (Stu_Bean s : sl) {
//			System.out.println(s);
//		}
		for (int i = 3000; i <= 40; i++) {
			Stu_Bean stu1 = new Stu_Bean(i, "a"+i, "男",20,  new Date());
			System.out.println(stu1);
			Db_Mysql.save(stu1);
			
		}
//		Page<Stu_Bean> p = pageList(1, 2);
//		System.out.println(p.toString());
//		for (Stu_Bean s : p.getItems()) {
//			System.out.println(s);
//		}
		
		
	}

	static Connection conn = Db_Test.getConnection();
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	public static void save(Stu_Bean stu) {

		String sql = "insert into stu(sid,sname,gender,age,brithday) values(?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, stu.getSid());
			ps.setString(2, stu.getSname());
			ps.setString(3, stu.getGender());
			ps.setInt(4, stu.getAge());
			ps.setTimestamp(5, new Timestamp(stu.getBrithday().getTime()));

			int i = ps.executeUpdate();
			System.out.println("已添加" + i + "行数据!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Db_Test.closed(ps, conn);
		}
	}

	public static void delete(int id) {

		String sql = "delete from stu where sid = ?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int row = ps.executeUpdate();
			System.out.println("成功删除" + row + "行语句！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Db_Test.closed(ps, conn);
		}
	}

	public static void update(Stu_Bean stu) {

		String sql = "update stu set sname = ?, age = ?, gender = ?, brithday = ? where sid = ?";

		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, stu.getSname());
			ps.setInt(2, stu.getAge());
			ps.setString(3, stu.getGender());
			ps.setTimestamp(4, new Timestamp(stu.getBrithday().getTime()));
			ps.setInt(5, stu.getSid());

			int row = ps.executeUpdate();
			System.out.println("已修改" + row + "行数据!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Db_Test.closed(ps, conn);

		}
	}

	public static List<Stu_Bean> findAByName(String name) {

		List<Stu_Bean> sList = new ArrayList<>();
	
//		String sql = "select sid,sname,age,gender,brithday from stu where sname like '%" + name + "%'";
		String sql = "select sid,sname,gender,age,brithday from stu where sname like ?";

		//ResultSet rs = null;

		try { 
			/*
			 * stat = conn.createStatement();
			 * rs = stat.executeQuery(sql);
			 */

			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+name+"%");
			System.out.println(sql);
			//rs = null;
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Stu_Bean stu = new Stu_Bean();
				int i = 1;
//				System.out.println(rs.getInt(i++)+rs.getString(i++)+rs.getString(i++));
				stu.setSid(rs.getInt(i++));
				stu.setSname(rs.getString(i++));
				stu.setGender(rs.getString(i++));
				stu.setAge(rs.getInt(i++));
				stu.setBrithday(rs.getTimestamp(i++));
				sList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Db_Test.closed(rs, ps, conn);
		}
		return sList;
	}

	public static Page<Stu_Bean> pageList(int page, int size) {
		
		Page<Stu_Bean> p = new Page<>(page, size);
		try {
			ps = conn.prepareStatement("select count(0) from stu");
			ResultSet rs = ps.executeQuery();
			
			int totalElement = 0;
			if (rs.next()) {
				totalElement = rs.getInt(1);
			}
//			System.out.println(totalElement+"");
			if (totalElement <= 0) {
				return null;
			}
			p.setTotalElement(totalElement);
			
			if (page < 0) {
				page = 1;
			} else if (page > p.getTotalPage()) {
				//当前页数大于总页数时，查询最后一页，在获取了page,size和查询了totalElement之后，TotalPage由setTotalPage()计算得出
				page = p.getTotalPage();	
			}
			if (size == 0) {
				size = 10;
			}
			String sql = "select sid,sname,gender,age,brithday from stu limit ?,? ";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*size);
			ps.setInt(2, size);
			ps.clearBatch();
			rs=null;
			rs = ps.executeQuery();
			List<Stu_Bean> slist = new ArrayList<>();
			while (rs.next()) {
				Stu_Bean stu = new Stu_Bean();
				int i = 1;
				//ps:读取性别和年龄的顺序与库表列的顺序不一致导致的转型错误。另外建议你的ResultSet为局部的变量更好
				stu.setSid(rs.getInt(i++));
				stu.setSname(rs.getString(i++));
				stu.setGender(rs.getString(i++));
				stu.setAge(rs.getInt(i++));
				stu.setBrithday(new Timestamp(rs.getTimestamp(i++).getTime()));
				
				slist.add(stu);
			}
			
			p.setItems(slist);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			Db_Test.closed(rs, ps, conn);
		}

		return p;

	}

}

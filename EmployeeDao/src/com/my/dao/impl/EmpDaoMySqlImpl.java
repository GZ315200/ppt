package com.my.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.my.common.DbHelper;
import com.my.common.entity.Page;
import com.my.dao.EmployeeDao;
import com.my.entity.Employee;

@SuppressWarnings("unused")
public class EmpDaoMySqlImpl implements EmployeeDao {
	QueryRunner qr  = new QueryRunner();
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "insert into employee(name,joinTime,gender,job,salary) values(?,?,?,?,?)";
		Connection conn = null;
//		PreparedStatement pstat = null;
		conn = DbHelper.getConnection();
		try {/*
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, emp.getName());
			pstat.setTimestamp(2, new Timestamp(emp.getJoinTime().getTime()));
			pstat.setBoolean(3, emp.isGender());
			pstat.setString(4, emp.getJob());
			pstat.setDouble(5, emp.getSalary());
			int row = pstat.executeUpdate();
			System.out.println("成功插入" + row + "行数据");*/
			qr.update(conn, sql,emp.getName(),emp.getJoinTime(),emp.isGender(),emp.getJob(),emp.getSalary());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
//			DbHelper.close(pstat, conn);
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id = ?";
		Connection conn = null;
//		PreparedStatement pstat = null;
		conn = DbHelper.getConnection();
		try {/*
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			int row = pstat.executeUpdate();
			System.out.println("成功删除" + row + "行数据");*/
			qr.update(conn, sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			DbHelper.close(pstat, conn);
			DbUtils.closeQuietly(conn);
		}
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "update employee set name = ?,salary = ? where id = ?";
		Connection conn = null;
//		PreparedStatement pstat = null;
		conn = DbHelper.getConnection();
		try {/*
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, emp.getName());
			pstat.setDouble(2, emp.getSalary());
			pstat.setInt(3, emp.getId());
			int row = pstat.executeUpdate();
			System.out.println("已更改" + row + "条数据");*/
			qr.update(conn, sql, emp.getName(),emp.getSalary(),emp.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			DbHelper.close(pstat, conn);
			DbUtils.closeQuietly(conn);
		}
	}

	@Override
	public Employee findOne(int id) {
		// TODO Auto-generated method stub
		String sql = "select id,name,joinTime,gender,job,salary from employee where id = ?";
		Employee emp = new Employee();
		Connection conn = null;
//		PreparedStatement pstat = null;
//		ResultSet rs = null;
		conn = DbHelper.getConnection();
		try {/*
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			rs = pstat.executeQuery();
			while (rs.next()) {
				int i = 1;
				emp.setId(rs.getInt(i++));
				emp.setName(rs.getString(i++));
				emp.setJoinTime(rs.getTimestamp(i++));
				emp.setGender(rs.getBoolean(i++));
				emp.setJob(rs.getString(i++));
				emp.setSalary(rs.getDouble(i++));
			}*/
			emp = qr.query(conn, sql, new BeanHandler<Employee>(Employee.class),id);
			//qr.update();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			DbHelper.close(conn, pstat, rs);
			DbUtils.closeQuietly(conn);
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> eSet = new ArrayList<>();

		String sql = "select id,name,joinTime,gender,job,salary from employee";
		Connection conn = null;
//		PreparedStatement pstat = null;
//		ResultSet rs = null;
		conn = DbHelper.getConnection();
		try {/*
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				int i = 1;
				emp.setId(rs.getInt(i++));
				emp.setName(rs.getString(i++));
				emp.setJoinTime(rs.getTimestamp(i++));
				emp.setGender(rs.getBoolean(i++));
				emp.setJob(rs.getString(i++));
				emp.setSalary(rs.getDouble(i++));
				eSet.add(emp);
			}*/
			eSet = qr.query(conn, sql, new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			DbHelper.close(conn, pstat, rs);
			DbUtils.closeQuietly(conn);
		}
		return eSet;
	}

	@Override
	public Page<Employee> findAll(int page, int size) {
		// TODO Auto-generated method stub
		Page<Employee> p = new Page<>(page, size);

		String sql = "select count(0) from employee";
		Connection conn = null;
//		PreparedStatement pstat = null;
//		ResultSet rs = null;
		conn = DbHelper.getConnection();
		// 分页查询 第一步 查询总数据量
		try {
			long totalElement = 0;
			/*
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			if (rs.next()) {
				totalElement = rs.getInt(1);
			}
			if (totalElement <= 0) {
				return null;
			}
			p.setTotalElement(totalElement);
			*/
			totalElement = qr.query(conn, sql, new ScalarHandler<Long>());
			// 根据page和size来获取最终要查询的数据
			if (page < 0) {
				page = 1;
			}
			if (page > p.getTotalPage()) {
				page = p.getTotalPage(); // 当查询的页数大于总页数时，查询最后一页
			}
			if (size == 0) {
				size = 10;
			}
			List<Employee> eSet = new ArrayList<>();
			String sql2 = "select id,name,joinTime,gender,job,salary from employee limit ?,?";
	/*		pstat = conn.prepareStatement(sql2);
			pstat.setInt(1, (page-1)*size);
			pstat.setInt(2, size);
			rs = pstat.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				int i = 1;
				emp.setId(rs.getInt(i++));
				emp.setName(rs.getString(i++));
				emp.setJoinTime(rs.getTimestamp(i++));
				emp.setGender(rs.getBoolean(i++));
				emp.setJob(rs.getString(i++));
				emp.setSalary(rs.getDouble(i++));
				eSet.add(emp);
			}
			p.setItems(eSet);//将查询到的所有数据存放到page模型的Items属性中
			*/
//			qr.query(conn, sql2, BeanListHandler<Employee>(Employee.class),(page-1)*size,size);
			eSet = qr.query(conn, sql2, new BeanListHandler<Employee>(Employee.class),(page-1)*size,size);
			p.setItems(eSet);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return p;
	}

}

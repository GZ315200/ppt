package com.my.test;

import java.util.Date;
import java.util.List;

import com.my.common.DaoFactory;
import com.my.common.entity.Page;
import com.my.dao.EmployeeDao;
import com.my.dao.impl.EmpDaoMySqlImpl;
import com.my.entity.Employee;

/**
 * 
 * @author 丫丫
 * 执行CRUD方法，测试结果
 */
@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao empdao = (EmployeeDao) DaoFactory.getInstance("employee");
		
		/*
		try {
			empdao.save(new Employee(2, "李赛", new SimpleDateFormat("YYYY-MM-DD dd:mm:ss").parse("1999-09-09 8:20:12"), false, "销售", 3000));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		for(int i = 0; i < 50; i++){
			empdao.save(new Employee(i, "员工"+i, new Date(), true, "销售", 3000.0+i));
		}*/
		
//		empdao.update(new Employee(1, "xx", new Date(), true, "xxx", 800.0));
	
//		empdao.delete(1);
		
//		System.out.println(empdao.findOne(2));
		
		
//		for (Employee emp : empdao.findAll()) {
//			System.out.println(emp);
//		}
		
		Page<Employee> p = empdao.findAll(2, 10);
		System.out.println("当前页数："+p.getPage()+"/总页数:"+p.getTotalPage()+"总行数:"+p.getTotalElement());
		for (Employee emp :p.getItems()) {
			System.out.println(emp);
		}
	}

}

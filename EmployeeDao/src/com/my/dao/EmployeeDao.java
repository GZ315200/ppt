package com.my.dao;

import java.util.List;

import com.my.common.entity.Page;
import com.my.entity.Employee;

public interface EmployeeDao {

	public void save(Employee emp);

	public void delete(int id);

	public void update(Employee emp);

	public Employee findOne(int id);

	public List<Employee> findAll();

	public Page<Employee> findAll(int page, int size);
}

package com.tvm.employee.main.service;

import java.util.List;

import com.tvm.employee.main.model.Employee;

public interface EmployeeService {
	void employeeSave(Employee employee);
	List<Employee> getAllEmployee();
	void empiddel(long empdel);
	Employee empFind(long id);
	//
	List<Employee> empFindByName(String name);
	List<Employee> empFindBySalary(int salary);
	

}

package com.tvm.employee.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvm.employee.main.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee> findByEmployeeName(String name);
	public List<Employee> findByEmployeeSalary(int salary);

}

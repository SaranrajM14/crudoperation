package com.tvm.employee.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.employee.main.model.Employee;
import com.tvm.employee.main.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void employeeSave(Employee empSave) {
		employeeRepository.save(empSave);
		
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>emp =employeeRepository.findAll();
		return emp;
	}
	@Override
	public void empiddel(long empdel) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empdel);
		
	}
	@Override
	public Employee empFind(long id) {
		// TODO Auto-generated method stub
		Optional<Employee>empFind= employeeRepository.findById(id);
		Employee emp=null;
		if(empFind.isPresent()) {
			emp=empFind.get();
		}
        
		return emp;
	}
	@Override
	public List<Employee> empFindByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> empFindByName=employeeRepository.findByEmployeeName(name);
		return empFindByName;
	}
	@Override
	public List<Employee> empFindBySalary(int salary) {
		// TODO Auto-generated method stub
		List<Employee> empFindBySalary=employeeRepository.findByEmployeeSalary(salary);
		
		return empFindBySalary;
	}

}

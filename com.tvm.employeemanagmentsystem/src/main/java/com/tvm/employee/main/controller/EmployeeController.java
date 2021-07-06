package com.tvm.employee.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tvm.employee.main.model.Employee;
import com.tvm.employee.main.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employSave")
	public Employee employSave(@RequestBody Employee empSave) {
		employeeService.employeeSave(empSave);
		
		return empSave;
	}
	@GetMapping("/employGet")
	public List<Employee> employGet()
	{
		List <Employee>emp=employeeService.getAllEmployee();
		return emp;
	}
	@PutMapping("/employPut")
	public Employee empput(@RequestBody Employee emput){
		employeeService.employeeSave(emput);
		return emput;
		
		
	}
	@DeleteMapping("/employDelete/{id}")
	public long empdel(@PathVariable(value="id") long a)
	{
		employeeService.empiddel(a);
		return a;
	}
	@GetMapping("/employById/{id}")
	public Employee empbyid(@PathVariable long id)
	{
		Employee emp=employeeService.empFind(id);
		return emp;
	}
	@PostMapping("employById")
	public Employee empReturn(@RequestBody Employee empRet)
	{
		Employee emp=employeeService.empFind(empRet.getEmployeeId());
		return emp;
	}
	//
	@GetMapping("/employByName/{name}")
	public List<Employee> empByName(@PathVariable String name)
	{
		List<Employee> emp=employeeService.empFindByName(name);
		return emp;
	}
	@GetMapping("/employBySalary/{salary}")
	public List<Employee> empBySalary(@PathVariable int salary)
	{
		List<Employee> emp=employeeService.empFindBySalary(salary);
		return emp;
	}
	
	

}

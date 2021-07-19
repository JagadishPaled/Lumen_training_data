package com.example.demo.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employees.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/employees")
	public Map<Integer, Employee> getAll(){
		
		return this.service.getAll();
	}

//	@GetMapping(path = "/employees/{id}")
//	public Employee getById(@PathVariable("id") int employeeId){
//		
//	//String resp="Not Found";
//	//int ststud
//	return this.service.getEmployee(employeeId);
//	}
	@GetMapping(path= "/employees/{id}")
	public ResponseEntity<String> findById(@PathVariable("id") int employe){
		String col;
		int status;
		Employee emplo=service.getEmployee(employe);
		if(emplo != null) {
			col=emplo.toString();
			status=200;
		}else {
			col="Not Found";
			status=208;
		}
		return ResponseEntity.status(status).body(col);
	}
}


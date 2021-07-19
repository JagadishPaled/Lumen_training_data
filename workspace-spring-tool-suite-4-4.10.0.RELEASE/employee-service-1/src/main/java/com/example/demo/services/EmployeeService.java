package com.example.demo.services;

import java.util.*;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.employees.Employee;

@Service
public class EmployeeService {
	Map<Integer,Employee> emp;
	public EmployeeService() {
		super();
		 emp=new HashMap<>();
        init();
       

	}
	private void init() {
 
		emp.put(1, new Employee(1,"Nishant","Bidar"));
		emp.put(2, new Employee(2,"Shivya","Varnasi"));
		emp.put(3, new Employee(3,"Kiranya","Bhalki"));
		emp.put(4, new Employee(4,"Jagya","Haveri"));
	}
	
//	Set<Employee> setId=new Set<Employee>();
//	public Employee getEmployee(int id)
//	{
//		return this.emp.get(id);
//	}
	public Map<Integer, Employee> getAll() {
		return emp;
	}
//	public ResponseEntity<String> getEmployee(int id){
//		return this.emp.get(id);
//		
//	}
	public Employee getEmployee(int id) {
		
		return this.emp.get(id);
	}
}
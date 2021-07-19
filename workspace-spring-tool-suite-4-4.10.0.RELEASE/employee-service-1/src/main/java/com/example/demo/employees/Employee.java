package com.example.demo.employees;

public class Employee {
	
	
	private int employeeId;
	private String employeeName;
	private String location;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int employeeId, String employeeName, String location) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}

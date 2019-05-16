package com.techlabs.analyser;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String empDesignation;
	private String managerId;
	private String dateOfJoining;
	private double salary;
	private  String commision;
	private int departmentNumber;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCommision(String commision) {
		this.commision = commision;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public String getManagerId() {
		return managerId;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public String getCommision() {
		return commision;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	
}

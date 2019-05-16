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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesignation == null) ? 0 : empDesignation.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDesignation == null) {
			if (other.empDesignation != null)
				return false;
		} else if (!empDesignation.equals(other.empDesignation))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	
	
}

package com.prod;

public class Employee {
	int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employId) {
		this.employeeId = employId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 10000;
		} else {
			this.salary = salary;
		}

	}

	public int getSalary() {
		return this.salary;
	}
	
	public String getEmpInfo() {
		String result = this.employeeName + "의 부서는 " //
				+ this.department + "이고 직무는 " + this.job //
				+ "이고 급여는" + this.salary + "입니다";
		return result;
	}
}

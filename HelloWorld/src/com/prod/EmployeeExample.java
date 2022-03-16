package com.prod;

public class EmployeeExample {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmployeeId(100);
		e1.setEmployeeName("김지찬");
		e1.setDepartment("개발부");
		e1.setJob("회계 프로그램 개발");
		e1.setSalary(-100); // employee에서 private를 걸었기 때문에 조회 불가
		//System.out.println(e1.getSalary());
		
		System.out.println(e1.getEmployeeName()+ " 의 부서는 " //
				+ e1.getDepartment() + " 직무는 " + e1.getJob() //
				+ " 월급은 " + e1.getSalary() + "입니다");

		System.out.println(e1.getEmpInfo());
		
		
		Employee e2 = new Employee();
		e2.setEmployeeId(110);
		e2.setEmployeeName("원태인");
		e2.setDepartment("총무부");
		e2.setJob("비품구매");
		e2.setSalary(200);
		
		System.out.println(e2.getEmpInfo());
	}
}

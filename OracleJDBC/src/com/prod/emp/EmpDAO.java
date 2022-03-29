package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO{
	//전체 조회 기능.
	public List<Employee> empList(){
		List<Employee> employees = new ArrayList<Employee>();
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			while(rs.next()) {//데이터가 들어있는 건수만큼 반복
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));//employees.employee_id를 int로 가져오겟다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0,10));
				emp.setJobId(rs.getString("job_id"));
				
				
				
				employees.add(emp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			disconnect(); //어떤것이 실행되어도 결국에 실행될것.
		}
		return employees;
		
	}
	
	
	//힌건 조회 기능.
	
	
	
	//입력 처리 
	
	
	
	//수정 처리
	
	
	
	//삭제 처리
	
}

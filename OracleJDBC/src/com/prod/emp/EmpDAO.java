package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {
	// 전체 조회 기능.
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();

		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			while (rs.next()) {// 데이터가 들어있는 건수만큼 반복
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));// employees.employee_id를 int로 가져오겟다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

				employees.add(emp);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			disconnect(); // 어떤것이 실행되어도 결국에 실행될것.
		}
		return employees;

	}

	// 힌건 조회 기능.

	// 입력 처리 excuteUpdate()
	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values (?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);// ? <-매개변수값중에서 employeeId 필드값
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate();// 실행된 건수 변환
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();
			

		}
	

	}

	// 수정 처리
//	public void updateEmp(Employee emp) {
//		conn = getConnect();
//		String sql = "update emp_java\r\n" + "set first_name = ?,\r\n" + "phone_number = ?,\r\n" + "salary = ?\r\n"
//				+ "WHERE employee_id = ?";
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			// 파라메터(?)의 값을 지정
//			psmt.setString(1, emp.getFirstName());
//			psmt.setString(2, emp.getPhoneNumber());
//			psmt.setInt(3, emp.getSalary());
//			psmt.setInt(4, emp.getEmployeeId());
//
//			int r = psmt.executeUpdate();
//			System.out.println(r + "로 수정이 됨");
//		} catch (SQLException e) {
//		
//			e.printStackTrace();
//		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
//			disconnect();
//
//		}
//	}
//	

	public void updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "update emp_java\r\n" //
				+ "set last_name = ?,\r\n"//
				+ "email = ?,\r\n" //
				+ "hire_date = ?,\r\n"//
				+ "job_id = ?\r\n" //
				+ "WHERE employee_id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?)의 값을 지정
			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getHireDate());
			psmt.setString(4, emp.getJobId());
			psmt.setInt(5, emp.getEmployeeId());

			int r = psmt.executeUpdate();
			System.out.println(r + "로 수정이 됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	// 삭제 처리
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp_java\r\n"//
				+ "WHERE employee_id = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}

	}

	public Employee searchEmp(int empId) {
		conn = getConnect();
		String sql = "select * from emp_java\r\n"//
				+ "WHERE employee_id = ? ";
		Employee emp = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);

			rs = psmt.executeQuery();

			if (rs.next()) {// 데이터가 들어있는 건수만큼 반복
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));// employees.employee_id를 int로 가져오겟다
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
		return emp;
	}
}
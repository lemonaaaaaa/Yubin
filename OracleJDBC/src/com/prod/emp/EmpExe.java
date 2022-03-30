package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메누: 1. 사원리스트 조회 2. 입력 3. 수정 4. 삭제 5. 한 건 조회 9.종료
		while (true) {
			System.out.println("메뉴: 1. 사원리스트 조회 2. 입력 3. 수정 4. 삭제 5. 한 건 조회 9.종료");
			System.out.println("메뉴를 선택하세요>>");

			int menu = scn.nextInt();
			if (menu == 1) {// 사원리스트 조회
				List<Employee> list = dao.empList(); // 전체조회기능 출력

				System.out.println("=================노비목록=================");
				for (Employee emp : list) {

					System.out.println(emp.toString());
				}
			} else if (menu == 2) {// 입력
				// 사원번호, lastName, email, hireDate, jobId
				int employeeId;
				String lastName;
				String email;
				String hireDate;
				String jobId;

				System.out.println("사원입력기능");
				Employee emp = new Employee();

				System.out.println("사원번호 입력>>");
				employeeId = scn.nextInt();

				System.out.println("LastName 입력>>");
				lastName = scn.next();
				System.out.println("email 입력>>");
				email = scn.next();
				System.out.println("고용일 입력>>");
				hireDate = scn.next();
				System.out.println("직책 입력>>");
				jobId = scn.next();

				// new Employee(employeeId, lastName, email, hireDate, jobId);

				emp.setEmployeeId(employeeId);
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setHireDate(hireDate);
				emp.setJobId(jobId);

				dao.insertEmp(emp);

//				boolean tOrF = dao.insertEmp(emp); // boolean타입으로 결과값을 받아와서
//				if (tOrF) {
//					System.out.println("정상");
//					System.out.println("등록완료");
//
//				} else {
//					System.out.println("오류, 등록되지않음");
//
//				}

			} else if (menu == 3) {// 수정
//사원번호, lastname, emailm hireDate, jobId
				int employeeId;
				String lastName;
				String email;
				String hireDate;
				String jobId;

				System.out.println("수정기능");
				System.out.println("수정할 사원의 ID를 입력>>");

				employeeId = scn.nextInt();

				System.out.println("수정후 LastName 입력>>");
				lastName = scn.next();
				System.out.println("수정후 email 입력>>");
				email = scn.next();
				System.out.println("수정후 고용일 입력>>");
				hireDate = scn.next();
				System.out.println("수정후 직책 입력>>");
				jobId = scn.next();

				Employee emp = new Employee();

				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setHireDate(hireDate);
				emp.setJobId(jobId);
				emp.setEmployeeId(employeeId);

				dao.updateEmp(emp);

				System.out.println("수정완료");

			} else if (menu == 4) {// 삭제
//삭제할 사원번호 받아서 삭제 .입력받는 변수하나 선언해서  삭제. 
				// dao.deleteEmp(사원변호변수);
				System.out.println("삭제기능");
				System.out.println("삭제할 사원ID를 입력하세요");
				int employeeId = scn.nextInt();

				Employee empId = new Employee();
				empId.setEmployeeId(employeeId);

				dao.deleteEmp(employeeId);

			} else if (menu == 5) {// 한건조회
				System.out.println("한건조회기능");
				System.out.println("조회할 사원ID를 입력하세요");
				int employeeId = scn.nextInt();

				Employee emp = dao.searchEmp(employeeId);
				System.out.println(emp.toString());
				System.out.println("조회완료");

			} else if (menu == 9) {// 종료
				System.out.println("꺼짐ㅃㅇ");
				break;
			}

		} // end of while
		System.out.println("end of program");
		scn.close();
	}// end of main
}

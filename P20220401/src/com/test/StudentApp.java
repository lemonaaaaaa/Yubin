package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> allStudents = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.

	public StudentApp() {
	}

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {

			allStudents.add(student);
		}

		@Override
		public void modStudent(Student student) {// 번호로 이름수정
			for (int i = 0; i < allStudents.size(); i++) {
				if (allStudents.get(i).getStudNo() == student.getStudNo()) {
					allStudents.get(i).setStudName(student.getStudName());

				}
			}
		}

		@Override
		public List<Student> studentList() {

			return allStudents;
		}

	}

	public void execute() {

		StudentService service = new StudentServiceImpl();

		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.
		while (true) {
			System.out.println("1.입력, 2.수정, 3.리스트 보기, 4.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.
				System.out.println("당신은 고등학생입니까? 대학생입니까?");
				System.out.println("1.고등학생 2.대학생");
				int bab = scn.nextInt();
				if (bab == 1) {
					System.out.println("학생 이름을 입력해주세요>>");
					String studName = scn.next();
					System.out.println("학생 번호를 입력해주세요(1~499, 숫자만 입력)>>");
					String studNo = scn.next();
					for (int i = 0; i < allStudents.size(); i++) {
						if (allStudents.get(i).getStudNo() != null) {
							System.out.println("그 번호는 이미 사용되고있습니다");
							return;
						} else {
							continue;
						}

					}
					System.out.println("학생의 담임교사를 입력해 주세요");
					String teachName = scn.next();
					System.out.println("학생의 반을 입력해 주세요");
					System.out.println("(숫자만 입력 가능)");
					String groupName = scn.next();

					Student s1 = new HighStudent(studNo, studName, teachName, groupName);
					service.addStudent(s1);

					System.out.println("등록되었습니다");

				} else if (bab == 2) {
					System.out.println("학생 이름을 입력해주세요>>");
					String studName = scn.next();
					System.out.println("학생 번호를 입력해주세요(500~숫자만 입력)>>");
					String studNo = scn.next();
					for (int i = 0; i < allStudents.size(); i++) {
						if (allStudents.get(i).getStudNo() == null) {
							System.out.println("그 번호는 이미 사용되고있습니다");
							return;
						} else {
							continue;
						}

					}
					System.out.println("학생의 담당교수를 입력해 주세요");
					String profName = scn.next();
					System.out.println("학생의 전공을 입력해주세요");
					String major = scn.next();

					Student s1 = new CollegeStudent(studNo, studName, profName, major);
					service.addStudent(s1);

					System.out.println("등록되었습니다");

				}

			} else if (menu == 2) {// 번호로 이름수정
				System.out.println("수정할 학생의 번호를 입력하세요");
				String studNo = scn.next();

				if (studNo == null) {
					System.out.println("해당되는 번호의 학생이 없습니다.");

				} else {

					System.out.println("수정할 이름을 입력하세요 >> ");
					String studName = scn.next();

					Student s1 = new Student(studNo, studName);
					service.modStudent(s1);
					System.out.println("수정하였습니다");

				}

			} else if (menu == 3) {// 학생정보리스트

				List<Student> allStudents = service.studentList();
				for (Student s : allStudents) {
					System.out.println(s.toString());

				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program.");
	}
}

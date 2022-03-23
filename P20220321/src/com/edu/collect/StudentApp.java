package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 멤버클래스
	abstract class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNo() == sno) {
					return list.get(i);

				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() {// 전체 학생 정보를 가져오게따

			return list;
		}

		@Override
		public void modifyStudent(Student student) {// 고치게따
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getStudentNo() == student.getStudentNo()) {
					list.get(i).setStudentEn(student.getStudentEn());
					list.get(i).setStudentKo(student.getStudentKo());
				}

			}
		}

	}

	public void execute() {
		// 메뉴 : 1.추가 2.리스트 3.한건조회. 4.수정 9.종료
		while (true) {
			System.out.println("메뉴 : 1.추가 2.리스트 3.한 건 조회. 4.수정 9.종료");
			System.out.println("선택 >>");

			int menu = scn.nextInt();
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;

			} else {
				System.out.println("잘못된 입력입니다.");
				return;
			}

		} // 끝
		System.out.println("===끝===");
	}
}

package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {
		list.add(new Student(101, "가희가희", 82, 97));
		list.add(new Student(102, "해정해정", 82, 24));
		list.add(new Student(103, "수연수연", 83, 75));
		list.add(new Student(104, "수연수연", 83, 75));
	}

	// 멤버클래스 생성.
	class StudentServiceFile implements StudentService {

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
		public void saveToFile() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Student> studentList() {// 전체 학생 정보를 가져오게따

			return list;
		}

		@Override
		public void modifyStudent(Student student) {// 고치게따
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNo() == student.getStudentNo()) {
					list.get(i).setStudentEn(student.getStudentEn());
					list.get(i).setStudentKo(student.getStudentKo());
				}

			}
		}

		@Override
		public void studentdelete(int sno) {
			System.out.println("없애버릴 학생의 번호를 입력하거라");
			sno = scn.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNo() == sno) {
					list.remove(i);

					System.out.println("이제 그런 학생은 없다!");
				} else if (list.get(i).getStudentNo() != sno) {
					System.out.println("그런 학생은 애초에 없어따");
				}

			}
		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			// 찾았다고 종료x

			for (int i = 0; i < list.size(); i++) {
				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()

				if (list.get(i).getStudentNa().equals(name)) {
					searchList.add(list.get(i));
				}
			}
			return searchList;

//				if (sna != StudentNa(i)) {
//					System.out.println("그런 학생은 없지만 등록해주겟다.");
//					System.out.println("학생 번호를 입력하세여 >> ");
//					int StudentNo = scn.nextInt();
//					System.out.println("학생 이름 입력하세여 >> ");
//					String StudentNa = scn.next();
//					System.out.println("영어 점수를 입력하세여 >> ");
//					int StudentEn = scn.nextInt();
//					System.out.println("국어점수를 입력하세여 >> ");
//					int StudentKo = scn.nextInt();
//
//					System.out.println("[학생의 정보 : " + StudentNo + ", " + StudentNa + ", " + StudentEn + ", " + StudentKo);
//				}else {
//					System.out.println("[학생의 정보 : " + StudentNo + ", " + StudentNa + ", " + StudentEn + ", " + StudentKo);
//				}

		}

	}

	public void execute() {
		StudentService service = new StudentServiceImpl();
		// 메뉴 : 1.추가 2.리스트 3.한건조회. 4.수정 9.종료
		while (true) {
			System.out.println("메뉴 : 1.추가 2.리스트 3.한 건 조회. 4.수정 5.삭제 6.이름조회 9.종료");
			System.out.println("선택 >>");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생 정보를 추가. 학생번호, 이름, 영어점수, 국어점수
				System.out.println("학생 번호를 입력하세여 >> ");
				int StudentNo = scn.nextInt();
				System.out.println("학생 이름 입력하세여 >> ");
				String StudentNa = scn.next();
				System.out.println("영어 점수를 입력하세여 >> ");
				int StudentEn = scn.nextInt();
				System.out.println("국어점수를 입력하세여 >> ");
				int StudentKo = scn.nextInt();

				Student s1 = new Student(StudentNo, StudentNa, StudentEn, StudentKo);
				service.insertStudent(s1);
			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건조회
				System.out.println("조회할 학생 번호를 입력하거라");
				int studNo = scn.nextInt();
				Student student = service.getStudent(studNo);
				if (student == null) {
					System.out.println("그런 놈은 없다");
				} else {
					System.out.println(student.toString());

				}
			} else if (menu == 4) {
				// 수정
				System.out.println("수정할 학생 번호를 입력하세여 >> ");
				int StudentNo = scn.nextInt();
				System.out.println("수정할 영어 점수를 입력하세여 >> ");
				int StudentEn = scn.nextInt();
				System.out.println("수정할 국어점수를 입력하세여 >> ");
				int StudentKo = scn.nextInt();

				Student s1 = new Student(StudentNo, null, StudentEn, StudentKo);
				service.modifyStudent(s1);
				System.out.println("고쳐줘따");
			} else if (menu == 5) {
				int sno = 0;
				service.studentdelete(sno);

			} else if (menu == 6) {

				System.out.println("찾는 학생의 이름을 입력하라");
				String name = scn.next();
				List<Student> list = service.searchStudent(name);
				for (Student s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 9) {
				System.out.println("꺼지겟따");
				break;

			} else {
				System.out.println("잘못된 입력입니다.");
				return;
			}

		} // 끝
		System.out.println("===끝===");
	}

}

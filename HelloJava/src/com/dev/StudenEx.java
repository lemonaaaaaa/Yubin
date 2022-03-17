package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudenEx {
	public static void main(String[] args) {
		// Scanner, 배열선언 5개, 입력, 리스트 출력
		Scanner scn = new Scanner(System.in);

		Student[] students = new Student[5];

		while (true) {
			System.out.println("원하시는 항목의 번호를 입력하세요.");
			System.out.println("\n 1. 입력 2. 리스트 조회 3. 종료");
			int menu = scn.nextInt();

			if (menu == 1) { // 학번, 이름, 영어, 수학, 국어 입력받아서 배열에 넣기
				System.out.println("입력메뉴를 선택하셨습니다");
				System.out.println("학번을 입력하세요 >>");
				int sno = scn.nextInt();
				System.out.println("이름을 입력하세요 >>");
				String sname = scn.next();
				System.out.println("영어점수를 입력하세요 >>");
				int escore = scn.nextInt();
				System.out.println("국어점수을 입력하세요 >>");
				int kscore = scn.nextInt();
				System.out.println("수학점수를 입력하세요 >>");
				int mscore = scn.nextInt();

				Student s1 = new Student(sno, sname, kscore, mscore, escore);

				for (int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						students[i] = s1;
						break;

					}

				}

				System.out.println("저장완료");

			} else if (menu == 2) {
				System.out.println("해당 리스트 입니다");
				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getStudInfo());
					}

				}
				System.out.println("조회 완료");
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("해당 메뉴는 없습니다");
			}

		}

		System.out.println("프로그램을 종료합니다.");
		scn.close();
	}
}

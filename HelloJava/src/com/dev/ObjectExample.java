package com.dev;

import java.util.Scanner;

//import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "이지영"); // 학생번호에 100이란 값을 지정
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100);
		s1.setEngScore(60);
		s1.setEngScore(80);

		Student s2 = new Student(101, "김민수", 80, 82, 85);
//		System.out.printf(s2.getStudName() + "의 평균은 %.2f", s2.getAvgScore());

		Student s3 = new Student(102, "킹지찬", 70, 80, 90);
		Student s4 = new Student(103, "나전범", 77, 82, 83);
		Student[] students = { s1, s2, s3, s4 };
		while (true) {
			System.out.println("조회하려는 학생의 이름을 입력하세요 ");
			String searchName = scn.next();
			if(searchName.equals("종료")) {
				break;}

			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {
					System.out.println(students[i].getStudInfo());
				}

				
			}

		}
		System.out.println("프로그램 종료");
		scn.close();
		}
	}


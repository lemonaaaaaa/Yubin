package com.edu;

import java.util.Scanner;
// 이름을 입력받도록 문자열. Srting -> scn.nextLine();
// 연락처 입력받고 String
// 나이 입력받고 int ->scn.nextInt();
// 키 입력받고 double -> scn.nextDouble();
// 이름은 : ??? 
// 연락처 : 010-2345-8764
// 나이 : 26
// 키 : 	167.4

public class TodayExample {

	public static void main(String[] args) {
		String name, number;
		int age;
		double height, weight, weight1, realweight;

		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name = scn.nextLine();

		System.out.println("연락처를 입력해주세요");
		number = scn.nextLine();

		System.out.println("나이를 입력해주세요");
		age = scn.nextInt();

		System.out.println("키를 입력해주세요");
		height = scn.nextDouble();

		System.out.println("몸무게를 입력해주세요");
		weight = scn.nextDouble();

		// double weight = 67.5;

		realweight = weight = (height - 100) * (0.9);

		System.out.println("이름은 " + name + " 입니다");
		System.out.println("연락처는 " + number + " 입니다");
		System.out.println("나이는 " + age + " 입니다");
		System.out.println("키는 " + height + " 입니다");
		weight1 = (height - 100) * (0.9);
		if (weight + 5 > realweight) {
			System.out.println("더 살고 싶으면 운동하시는게 좋겠어요");
		} else if (weight - 5 < realweight) {
			System.out.println("너무말랐어");
		} else {
			System.out.println("적정몸무게입니다");

		}

		scn.close();

	}

}

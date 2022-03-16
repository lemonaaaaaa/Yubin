package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); // 반드시 초기화를 하고
		s1.studentName = "김지찬";// 변수를 담아줘야지
		s1.korScore = 80;
		s1.engScore = 85;
		s1.study("인생"); // study라는 method 이용 가능
//      s1.eat(); //적용시키려면 컴파일(저장)해줘야 이용 가능
		s1.eat("밥");
		s1.eat("카페인");

		int v1 = s1.getkorScore();
		System.out.println(v1);
		
		int v2 = s1.getEngScore();
		System.out.println(v2);
		
		System.out.println("국어점수는 " + v1 + " 영어점수는 " + v2);
	}
}

package com.edu;
//Object(객체):실제 보이는것, 추상적인 것 -> Class(도면, 틀):특징을 프로그램상으로 구현하기 위해 도면으로 뽑아낸 것
//-> 인스턴스 생성(초기화)
//학생(객채 : Object) > class student -> instant (new student))
public class ObjectExample {
 public static void main(String[] args) {
//	 int num1 = 10;
//	 double num2 = 12.34;
//	 double num3 = 20; //자동형변환(Promotion)
//	 int num4 = (int)23.4; // 강제형변환(Casting)
//	 
//	 String str1 = new String(); //heap(인스턴스) 클래스에 들어가는 값은 실제로는 주소값
//	 Car car1 = new Car(); //초기화(인스턴스 생성)
//	 car1.setModel("Sonata");
//	 car1.setPrice(1000000);
	 
	 
	 Student s1 = new Student(); 
	 s1.setStudNo(100);
	 s1.setStudName("킹지찬");
	 s1.setKorScore(90);
	 s1.setEngScore(80);
	 s1.setMathScore(85);
	 System.out.println("영어점수 초기값 " + s1.getEngScore());
	 System.out.println("이름 초기값 " + s1.getStudName());
	 System.out.println(s1.getStudName() +"의 합계 " + s1.getSumScore());
	 System.out.println(s1.getStudName() +"의 평균 " + s1.getAvgScore());
	 
	
}
}

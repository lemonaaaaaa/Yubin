package com.prod;

public class MemberExample {
	
	public static void main(String[] args) {
	

	//int num1=10;
	//String member = "김지찬"
	// ?? name = "강민호", "10" -변수두개선언해야하는데 클래스 활용하면 
	//나의 정의에 따라 여러 유형의 데이터를 담을 수 있다
	//숫자와 문자를 다 넣고싶을때 새로운 데이터타입 선언 
	
	Member mem1 = new Member(); //반드시 뉴와 괄호. name,age는 값이 없는 상태
	mem1.name = "김지찬"; //값을 담기 위에서 위에서 초기화한 것
	mem1.age = 20;
	
	Member mem2 = new Member();
	mem2.name = "강민호";
	mem2.age = 42;
			
	
	//System.out.println( mem[i] + " 의 name 속성의 값은 " + mem[i].name);
	System.out.println("mem의 age 속성의 값은 " + mem1.age);
	
	
	Student st1 = new Student(); //초기화
	st1.studnetNo = "22-12345678";
	st1.studentName = "김민수";
	st1.korScore = 90;
	st1.engScore = 80;
			
	
	
	System.out.println("st1의 studentNo 속성의 값은 " + st1.studnetNo);
	
}
}
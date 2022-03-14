package com.edu;

public class Variables {
	public static void main(String[] args)  {
//		변수  :  메모리공간  이름지정   값을 할당.
		int age = 20;
		System.out.println("age변수: " + age);
		int num1 = 60;
		int num2 = 50;
		int result = num1 + num2;
	
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("20 + 10= 30");
		
		String name = "홍길동" ;
		name = "이유빈";
		System.out.println(name + "의 나이는"  + age  +  "입니다.");
		
		String myName = "이유빈";  // 상수 (constance) 한번 값이 할당되면 바꿀수 없음
//		myName = "최유빈";
//		전화번호, 이메일 값을 담을 수 있는 변수. 010-1234
		
		
		String phone = "011-5464-1546";
		String email = "sdfasdsfdaf@email.com";
		
		System.out.println( myName + "의 전화번호:" + phone +" 이고 이메일은" + email + " 입니다");
		
	}
}

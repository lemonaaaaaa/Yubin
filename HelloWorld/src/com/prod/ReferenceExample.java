package com.prod;
//class Member { 
//	int age; 
//}

public class ReferenceExample {
	public static void main(String[] args) {

		int num1 = 10; // literal
		int num2 = 10; //
		// int, double, (byte, short, long, float, char)
		System.out.println(num1);
		System.out.println(num2);
		//얘네는 == 로 출력해도 true로 나옴
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		//실제 str1, str2는 각각의 주소값이고 둘은 같은 내용이라도 false (참조타입)
		//문자열을 비교하려면 equals 사용
		System.out.println(str1.equals(str2));
		//참조타입은 주소를 가지고 있어서 비교하면 false 안의 값을 비교하고싶으면 equals 사용...
		
	
	
	
	}
}

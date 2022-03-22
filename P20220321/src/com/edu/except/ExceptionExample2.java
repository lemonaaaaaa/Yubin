package com.edu.except;
import java.util.Calendar;
import java.util.Scanner;


Class String2 extends String{
	//public final String{} //상속불가능한 클래스를 표현할때 파이널.
}

public class ExceptionExample2 {
	public static void main(String[] args) {

		// Object -어떤 클래스든 다 받아들일 수 있는 최상위 클래스
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드값 " + obj.hashCode());
		
		try {
			Class.forName("java.lang.String"); // java.lang에 스트링이라는게 있는지 확인하는

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("해당 클래스는 없다 우매한 인간아 ");
		}

		// RuntimeException                                                                                  
		String str = null;
		try {
			str.charAt(0); // CharSequence 인터페이스의 구현머시기
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("null포인트 예외 발생");
			e.printStackTrace();
		}

		String num1 = "백";// 숫자문자열
		String num2 = "이백";
		//int num1, num2;
		try {
			int num1 = Integer.parseInt(nums1);// int 변환
			int num2 = Integer.parseInt(nums2);
			str.charAt(0);
		} catch (NumberFormatException e) {
			num1 = 0;
			num2 = 0;
		} catch (Exception e2) {
			System.out.println("상위의 예외 발생");
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		showError();

		System.out.println("프로그램 꺼 졍 ");

	}// end of main()

	public static void showError() throws ClassNotFoundException {//throw로 넘기거나 try catch로.

		Class.forName("java.lang.Strings");

		System.out.println("예외발생");
	}
}

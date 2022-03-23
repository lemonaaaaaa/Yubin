package com.test;



import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 
//사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Book[] books = new Book[100];
		System.out.println("책 제목을 입력하세요 : ");
		String bookName = scn.next();
		if(bookName == null) {
			System.out.println("이미 등록된 책입니다");
			return;
		}else {
			System.out.println("책 저자를 입력하세요");
			String bookWriter = scn.next();
			System.out.println("출판사를 입력하세요");
			String bookPrint = scn.next();
			System.out.println("가격을 입력해주세요");
			int bookPrice = scn.nextInt();
			
			
			System.out.println("[ 책 제목은 : " + bookName + ", 저자는 " + bookWriter //
					+ ", 출판사는 " + bookPrint + ", 가격은 " + bookPrice + " ]");
			
			System.out.println("등록이 완료되었습니다 :3");
		}
		
			
		
		
	}
}

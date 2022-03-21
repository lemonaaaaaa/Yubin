package com.test;

import java.util.Scanner;

import com.test.Book;;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 
//사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	static Book[] books = new Book[100];
	static Scanner scn = new Scanner(System.in);
	// 1.책제목 2. 저자 3. 출판사 4. 금액 5. 조회 6. 종료

	public static void main(String[] args) {
		
//		int menu =0;
		
		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createBookNa();
			} else if (menu == 2) {
				showBook();
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
//			} else if (menu == 4) {
//				creatBookWr();
//			} else if (menu == 5) {
//				creeatBookPr();
//			} else if (menu == 6) {
//				creatBookMo();
//			}
				
		}System.out.println("end of program");
		}
	}
		
	//}// end of main

	// 메뉴
	public static void printMenu() {
		String menu = "===============================================\r\n" //
				+ "1.책 등록\r\n" //
				+ "2.책 조회\r\n" //
				+ "3.종료\r\n" //
				+ "==============================================\r\n" //
				+ "+선택>	";
	
		System.out.println(menu);
	}
		//도서 등록 메소드
	public static void createBookNa() {
		System.out.println("책 정보 등록 기능");
	while(true) {	
		System.out.println("책 제목을 입력해 주세요 >> ");
		String bookName = scn.next();
		if(showBook(bookName) == null);
		System.out.println("이미 해당 책이 등록되어 있습니다");
		continue;
	}break;
	System.out.println("책의 저자를 입력해 주세요 >> ");
	String bookWriter = scn.next();
	System.out.println("책의 가격을 입력해 주세요 >> ");
	int bookPrice = scn.nextInt();
	
	System.out.println("책 정보가 정상적으로 등록되었습니다");
	
	}
		
		public static void showBook() {
			System.out.println("책 정보 조회입니다.");
			for(int i = 0; i < books.length; i++) {
			if(books[i] != null) {
				System.out.println(books[i].getBookName(), books[i].getBookWriter(),//
						books[i].getBookPrint(), books[i].getBookPrice());
			}
		
			}
//책 정보 생성 메소드
//		while (true) {
//			if()
//			System.out.println("");
//		}
	
}
}
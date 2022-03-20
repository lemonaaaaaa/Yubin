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

		public static void printMenu() {
			String menu = "===============================================\r\n" //
					+ "1.책 등록"
					+ "2.책 조회  " + "==============================================\r\n" //
					+ "+선택>	";

			System.out.println(menu);
			
		while (true) {
			printMenu();
			int menu = scn.nextInt();

//			if (menu == 1) {
//				creatBookNa();
//			} else if (menu == 2) {
//				creatBookWr();
//			} else if (menu == 3) {
//				creatBookPr();
//			} else if (menu == 4) {
//				creatBookMo();
//			} else if (menu == 5) {
//				showBook();
//			} else if (menu == 6) {
//				System.out.println("프로그램을 종료합니다");
//				break;
			}
			public static void creatBookNa();
			System.out.println("책이름을 입력해주세요");
			String inputNa = scn.next();
			
			public static void creatBookWr();
			System.out.println("저자를 입력해주세요");
			String inputWr = scn.next();
			
			public static void creatBookPr();
			System.out.println("출판사를 입력해주세요");
			String inputPr = scn.next();
			
			public static void creatBookMo();
			System.out.println("가격을 입력해 입력해주세요");
			int inputMo = scn.nextInt();
			
			
		}

		System.out.println("책 등록이 완료되었습니다");
	}

	// 메뉴

		
		
}
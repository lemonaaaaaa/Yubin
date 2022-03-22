package com.edu.except;

import java.util.InputMismatchException;

//클래스 A 클래스 B~~~~~~~~~~~Z
//메인메소드를 담고있는 main 메소드 포함(실행클래스) 나머지는 참조(참고 인스턴스 포함).

import java.util.Scanner;

public class LibraryExe {
	private static LibraryExe singleton = new LibraryExe();
	
	private LibraryExe() {
		
	}
	public static LibraryExe getInstance() {
		return singleton;
	}
		
	
	public void run(){
	
	
	//public static void main(String[] args) {
		// 책 제목, 저자, 가격을 입력해서 저장시키는것.
		// 리스트 보여주기.
		Scanner scn = new Scanner(System.in);
		Book[] library = new Book[5];
		int menu = 0;

		while (true) {

			try {
				showMessage("메뉴선택: 1. 책 정보 입력 2. 리스트 보기 3. 종료");

				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scn.next();
			}

			if (menu == 1) {
				showMessage("책 제목을 입력하세요>>>");
				String title = scn.next();
				showMessage("저자를 입력하세요>>>");
				String author = scn.next();

				int price = 0;
				while (true) {
					try {
						showMessage("가격을 입력하세요>>>");
						price = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요");
						scn.next();
					}
				}
				Book book = new Book(title, author, price);
				for (int i = 0; i < library.length; i++) {
					if (library[i] == null) {
						library[i] = book;
						break;

					}

				}
				showMessage("저장완료");

			} else if (menu == 2) {
				for (int i = 0; i < library.length; i++) {
					if (library[i] != null) {
						library[i].showInfo();// null값이 아닌 경우만 보여주게따

					}

				}
			} else if (menu == 3) {
				showMessage("프로그램을 종료합니당");
				break;
			}

		} // end of while()
		showMessage("=====end of program=====");
	}

	public static void showMessage(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	}


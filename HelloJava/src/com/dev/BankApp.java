package com.dev;

import java.util.Scanner;

//BankApp(main method), Account(계좌번호, 예금주, 잔액)
public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
			}
		}
	}

	// 메뉴: 1.계좌생성(번호, 예금주, 예금액)
	// 2. 예금(번호입력, 예금액 입력)==>최고 10만원까지만 가능.
	// 3. 출금(번호입력, 출금액) ==>잔고 이상의 금액은 출금 못하도록.
	// 4. 잔액조회(번호)
	// 5. 종료.

	// 메뉴출력기능
	public static void printMenu() {
		String menu = "1.계좌생성(번호, 예금주, 예금액)\r\n" //
	+ "2. 예금(번호입력, 예금액 입력)==>최고 10만원까지만 가능.\r\n"//
	+ "3. 출금(번호입력, 출금액) ==>잔고 이상의 금액은 출금 할수없음.\r\n"// 
	+ "4. 잔액조회(번호)" + "5. 종료.\r\n" + "선택>";

		System.out.println(menu);
	}

	// 계좌 생성
	public static void createAccount() {
		System.out.println("계좌생성");
		System.out.print("계좌번호 입력>>");
		String accNo = scn.next();
		System.out.println("예금주 이름 입력");
		String accName = scn.next();
		System.out.println("예금액 입력");
		String accMoney = scn.next();
		Account account = new Account(accNo, accName, accMoney){// new account(
		System.out.println("계좌가 정상적으로 생성되었습니다");
		
	}

	// 예금처리
	public static void deposit() {
		System.out.println("예금");
		System.out.println("예금주 이름 입력");
		String accName = scn.next();
		System.out.println("예금액 입력");
		int accMoney = scn.nextInt();
		
		int checkCnt = 0;
		for(int i= 0; i < banks.length; i++) {
			if(banks[i].getAccNo().equals(accMoney)) {
				int currAmt = banks[i].getMoney();
				checkCnt = 1;
				int currAmt = banks[i]
				
			}
		}
	}

	// 출금처리
	public static void withdraw() {
		System.out.println("출금");
		System.out.println("예금주 이름 입력");
		String accName = scn.next();
		System.out.println("출금액 입력");
		int accMoney = scn.nextInt();
	}

	// 잔액조회
	public static void findAccountMoney() {
		System.out.println("조회기능");
		System.out.println("계좌번호 입력");
		System accNo = scn.next();
		System.out.println("현재 잔액은");
	}
//전체 리스트 출력
}
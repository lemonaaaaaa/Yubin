package com.dev;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// 물건 가격이 5만원 이상이면 배송비 0
		// 그외 배송비 3000원 .

		// 결제할 금액이 얼마일지를 보여주는 코드

		// 결제할 금액은 ---입니다.

		int price;

		Scanner scn = new Scanner(System.in);
		System.out.println("상품 가격을 입력해 주세요");
		price = scn.nextInt();

		if (price >= 50000) {
			System.out.println("결제할 금액은 " + price + "입니다");
		} else {
			System.out.println("결제할 금액은" + (price + 3000) + "입니다");
		}
		scn.close();
	}

}

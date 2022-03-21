package com.test;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {

		int[] ary = new int[5];
		for (int i = 0; i < 5; i++) {
			ary[i] = (int) (Math.random() * 6) + 1;
		
			
			if (ary[i] > 5) {
				System.out.println("가장 큰 수는 6입니다");
				break;
			}
			if (6 > ary[i] && ary[i] > 4) {
				System.out.println("가장 큰 수는 5입니다");
				break;
			}
			if (5 > ary[i] && ary[i] > 3) {
				System.out.println("가장 큰 수는 4입니다");
				break;
			}
			if (4 > ary[i] && ary[i] > 2) {
				System.out.println("가장 큰 수는 3입니다");
				break;
			}
			if (3 > ary[i] && ary[i] > 1) {
				System.out.println("가장 큰 수는 2입니다");
				break;
			}
			if (2 > ary[i] && ary[i] > 0) {
				System.out.println("가장 큰 수는 1입니다");
				break;
			}
		}
	}
}
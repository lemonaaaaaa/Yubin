package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		// 1~10 까지의 수 중에서 짝수만 출력하기
		// while 문으로 작성
//		int i;
//		int num = 2;
//		while (true) {
//			i = (num++);
//			num++;
//			if(i % 2 == 0 );
//			System.out.println("1~10 중의 짝수는" + i);
//
//			if (num > 10)
//				break;
			
			int i = 1; //초기화
		    while(i <= 10) {
		    if(i % 2 == 0) {
		      System.out.println("i의 값=> " + i);
		          }
		    i++; // 증감식 홀수
		}

	}
}

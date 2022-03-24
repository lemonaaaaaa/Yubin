package com.dev;

public class ForExample2 {
	public static void main(String[] args) {
		// for 반복문으로

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println();
		int sum = 0;
		int startCnt = 11;
		int lastCnt = 20;

//	 for (int i = 2; i <=10; i += 2) {
//			System.out.println(i);

		for (int i = startCnt; i <= lastCnt; i++) {
			if (1 % 2 == 0) 
				System.out.println(i);
				sum += i;
				System.out.println("짝수의 합: " + sum);

			
		}

	}
}

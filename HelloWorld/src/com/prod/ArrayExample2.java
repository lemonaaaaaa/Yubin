package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		// ages -> int

//		int sum = 0;
//		int age1 = 20;
//		int age2 = 23;
//		int age3 = 27;

		int[] ages = new int[3];
		ages[0] = 20;
		ages[1] = 23;
		ages[2] = 27;

		for (int i = 0; i < 3; i++) {
			System.out.println("나이는 " + ages[0] + " 입니다");
			System.out.println("나이는 " + ages[1] + " 입니다");
			System.out.println("나이는 " + ages[2] + " 입니다");
			int sumAge = 0;
			sumAge += ages[i];
			System.out.println("나이의 합은 " + sumAge + "입니다");

			double avgAge = 0;
			avgAge = sumAge / (double) 3;
			System.out.println("나이의 평균은 " + avgAge + " 입니다");

			break;

		}

	}
}

package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };

		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < numbers.length; i++) {// number.lengths 쓰면 넘버값에 수가 추가되어도 수정할 필요가 없음
			if (numbers[i] % 2 == 0) { // 짝수일 경우에
				sum += numbers[i];
				cnt++;

			}

		}

		System.out.println("짝수값의 합은 " + sum + " 입니다");
		System.out.println("짝수값의 평균은 " + (sum / (double) cnt) + "입니다");

	}
}

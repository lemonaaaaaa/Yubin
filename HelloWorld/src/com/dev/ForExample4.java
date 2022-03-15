package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		// 1~10까지의 수 중에서 짝수의 값=>evenSum, 홀수의 값=>oddSum
		// 홀수의 합: 짝수의 합:

		{
			int evenSum, oddSum;
			evenSum = oddSum = 0;

			for (int i = 1; i <= 10; i++)
				if (i % 2 == 0) {
					evenSum += i;
				} else {
					oddSum += i;
				}

			System.out.println("짝수의 합은 " + evenSum);
			System.out.println("홀수의 합은 " + oddSum);
		}

	}

}

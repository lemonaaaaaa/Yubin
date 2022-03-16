package com.prod;

public class ArrayExample5 {
public static void main(String[] args) {
	int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
	
	int sum = 0;
	int cnt = 0;
	for(int i = 0; i < numbers.length; i++)
		if ( i % 2 == 0) {
			sum += numbers[i];
		cnt++;
		
		}
		
	System.out.println("홀수번째에 있는 수의 합은 " + sum + " 입니다");
	System.out.println("혹수번째에 있는 수의 평균은 " + (sum / (double) cnt) + "입니다");
}


}

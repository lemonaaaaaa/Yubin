package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		long l1 = 45679876868484546L; // L을 붙여서 int가 아닌 long으로 인식하게 함
		int i1 = 100; // 데이터를 담을 수 있는 메모리의 크기가 4byte //1byte=1 bit
		byte b1 = 127; // 데이터를 담을 수 있는 메모리의 크기가 1byte -128~-1 0~127
		b1++; // 127을 넘으면 최대값을 넘겨서 다시 -로 돌아감
		b1++;
		short s1 = 100; // 2byte -32768~-1, 0~32767 Integer.MAX_VALUE

		System.out.println(Long.MAX_VALUE);

		int sum = 0;
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;

		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		double avg = sum / (double) 5;
        
		int[] scores = new int[5];
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
//		System.out.println(scores[0] + scores[1]);
		//배열을 활용해서 sum => avg
		
		for(int i=0; i < 5; i++) { //몇번째 위치에 있는 값을 불러오겠습니다~
	//		System.out.println(scores[i]); //scores 0번째 있는 값을 출력하겠습니다
			sum += scores[i];
		
		}
		
        avg = sum /(double) 5;
        System.out.println("평균은" + avg);
       
	}
}

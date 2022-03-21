package com.edu;

public class ArraySort {
	public static void sorting(int[] ary) {//메소드 생성
		int loopCnt = ary.length - 1;// 마지막값이 제일 처음위치로 이동하려면 배열크기-1

		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0]; // 첫번째 값으로 temp 값을 지정

			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					// 34 25 위치 변경
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;

				}
			}
		}
	

	public static void main(String[] args); {
		// int[] 변수이름은 intAry => {34, 25, 48, 12};
		// 배열의 오름차순으로 정렬하는 코드
		// intAry[i] -> intAry[i+1]; 일 경우 두 배열의 자리를 바꾸는 것 temp 3번....
		int[] intAry = { 34, 25, 48, 12 };// 제일 마지막값이 최소값이라고 가정
		int[] intAry2 = { 34, 25, 48, 12 };
		int[] intAry3 = { 34, 25, 48, 12 };

		
		sorting(intAry);
		sorting(intAry2);
		sorting(intAry3);
		for(int i; i < intAry.length; i++) {
			System.out.println(intAry3[i]+ " ");
		}
	}
//		int temp = intAry[0];
//
//
//		if (intAry[0] > intAry[1]) {
//			intAry[0] = temp;
//			if( intAry[1]> intAry[2]) {
//				intAry[1] = temp;
//				intAry[2] = intAry[1];
//				intAry[2] = temp;
//			}if(intAry[2] > intAry[3]) {
//				intAry[2] = temp;
//				intAry[3] = intAry[2];
//				intAry[3] = temp;
//			}
//		
//
//			
//			
//			
//			
//			for (int i = 0; i < 4; i++)
//				System.out.println(intAry[i]);
//		}

		// 변경된 결과 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}

		System.out.println("end of prog");
	}
}

package com.edu;

public class ArraySort {
	public static void sorting(int[] Ary) {// 메소드 생성
		int loopCnt = Ary.length - 1;// 마지막값이 제일 처음위치로 이동하려면 배열크기-1

		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = Ary[0]; // 첫번째 값으로 temp 값을 지정

			for (int i = 0; i < loopCnt; i++) {
				temp = Ary[i];
				if (Ary[i] > Ary[i + 1]) {// 34 25 위치 변경
					Ary[i] = Ary[i + 1];
					Ary[1 + i] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {

		// 인트[] 변수이름은 intAry => {34, 25, 48, 12};
		// 배열의 오름차순으로 정렬하는 코드

		int[] intAry = { 34, 25, 48, 12 };// 제일 마지막값이 최소값이라고 가정
		int[] intAry2 = { 22, 56, 99, 12 };// 제일 마지막값이 최소값이라고 가정-오름차순으로 밖/ㅜ기
		int[] intAry3 = { 22, 56, 99, 12 };// too.

		sorting(intAry);// 변경된 결과 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}
		System.out.println();
		sorting(intAry2);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}
		System.out.println();
		sorting(intAry3);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}
		System.out.println();
		System.out.println("======긋=====");
	}

}

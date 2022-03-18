package com.dev;

//2차원배열 배열안의 배열
public class DimensionArray {
	public static void main(String[] args) {

		int[][] intRectAry = new int[5][5];
		int cntNum = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intRectAry[i][j] = cntNum++;

			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {//  (int j = 0; j < 5; j--) 이런식으로해서 바꿀수도잇음
//				System.out.println("[" + i + "," + j + "] =>" + intRectAry[i][j]);
				System.out.printf("%3d", intRectAry[j][i]); // 둘의 위치를 바꾸면서 xy좌표값이 달라진다

			}
			System.out.println();
		}

//		int[] intAry = { 20, 38, 45 }; // |20|38|45|
//		System.out.println(intAry[0]); // 20
//
//		int[][] intDimAry = { { 23, 34 }, { 12, 32, 45 }, { 37, 39 } };
//		int[] anotherAry = intDimAry[0]; // -> 정수형 배열 int[]
//		System.out.println(anotherAry[0] == intDimAry[0][0]); // true
//
//		System.out.println(intDimAry[0][1]); // 34 0번째 배열의 1(0,1)
//		intDimAry[1][1] = 33;
//		System.out.println(intDimAry[1][1]);

	}

}

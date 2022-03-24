package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

//Operator : 연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {

		IntBinaryOperator intBin = (int left, int right) -> left + right;
		intBin.applyAsInt(10, 20);

		intBin = (num1, num2) -> num1>num2?num1:num2; //둘을 비교해서 그렇다면 트루 아니면 폴스
		int result = maxOrMin(intBin);
		System.out.println(result);
		
	}

	public static int maxOrMin(IntBinaryOperator intBin) {
	int[] intAry = {85, 47, 92};	
	int result = 0; //intAry[0];
	for(int num : intAry) {
		result = intBin.applyAsInt(result, num);
		
	}return result;
	
	}

}
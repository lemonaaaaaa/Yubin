package com.prod;

public class Calculator {

	double PI = 3.14;

	// 매개변수들
	int add(int n1, int n2) {
		return n1 + n2; // 두개의 수를 받아서 더해서 반환해주는 함수가 add

	}
	// 반환: int, method=minus 매개변수는 v1, v2. v1-v2를 반환하는 method

	int minus(int v1, int v2) {
		return v1 - v2;

	}

	// 사각형 넓이 계산
	double getRecArea(double x, double y) {
		return x * y;

	}
	
	//원의 넓이 계산
	double getCircleArea(double radius){
		return PI * radius * radius;
	}

}

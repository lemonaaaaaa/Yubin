package com.prod;

public class Student {
	// 22-123456
	String studnetNo;
	String studentName;
	int korScore;
	int engScore;

	// method = 기능(함수)
	void study(String subj) { //안의 내용은 매개변수
		System.out.println(subj + "을 공부 합니다.");
	// void= 비어있다는 의미	
	}
	
	void eat(String food) { //문자열이 와야한다고 했는데 값을 넣지 않았기에 오류가 남
		System.out.println( food + "을 먹습니다.");
		
	}
	
	int getkorScore() {
		return korScore;
	}
	
	int getEngScore() {
		return engScore;
		
	}
}

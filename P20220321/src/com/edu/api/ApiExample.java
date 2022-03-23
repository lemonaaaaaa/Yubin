package com.edu.api;

public class ApiExample {
	public static void main(String[] args) {

//		IDCheck idcheck = new IDCheck();
//		String result = idcheck.getGender("9503042234567");
//		System.out.println(result);
//		result = idcheck.getGender("980317-1768412");
//		System.out.println(result);
//		result = idcheck.getGender("980317-5768412");
//		System.out.println(result);
		
		
		
		Math.random(); // new Math(); 현재 static 상태.
		//인스턴스를 따로 설정하지 않아도 실행됨
		long result = Math.round(3.5); // 반올림값 출력
		System.out.println("3.5의 반올림값은" + result);
		double r1 = Math.ceil(3.1); // 올림값 출력
		System.out.println("3.1 의 올림값은 " + r1);
		r1 = Math.floor(3.9);// 내림값 출력
		System.out.println("3.9의 내림값은 " + r1);
		double r2 = Math.abs(-30); //절대값 출력
		System.out.println("-30의 절댓값은" + r2);

		System.out.println("end of program");

	}
}

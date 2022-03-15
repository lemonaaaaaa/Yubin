package com.dev;

public class SwitchExample2 {
	public static void main(String[] args) {
		//90점 이상A, 80점 이상 B, 70점이상 C, 60점이상 D, 그외 F
		
		int score = 23; // 하나의 값으로 
		
		switch(score / 10) {
		case 9:
		    System.out.println("A학점입니다 인생 열심히 살았네");
		    break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		default:
			System.out.println("F입니다 등록금아까워");
		
		}
		
		System.out.println("end of program");
		
		
		
	}
}

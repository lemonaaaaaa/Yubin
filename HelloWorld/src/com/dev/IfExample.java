package com.dev;

public class IfExample { // WhichExample, firstName, first_name
	public static void main(String[] args) {
		// 조건문 if 60점 이상이면 pass

		int score = 83;

		if (score > 60) {
			System.out.println("Pass입니다.");
		} else {
			System.out.println("F입니다");
		}

		// 90점 이상이면 A, 80점 이상이면 B 70이상이면 C 60점이상 D 그외 F
		if (score >= 90) {
			if (score >=95) {
				System.out.println("A+입니다");
			}else {
			System.out.println("A입니다");
			}
			
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+입니다");
			}
			
			System.out.println("B입니다");
		} else if (score >= 70) {
			if (score >=75) {
				System.out.println("c+입니다");
			}
			System.out.println("C입니다");
			}
		 else if(score>=60){
			if(score>=65){
				System.out.println("D+입니다");}
				System.out.println("D입니다");}
		else{System.out.println("F입니다");}

System.out.println("end of program");

}

}

package com.edu;

import java.util.Scanner;

public class RectangleExample {
 //가로, 세로, 길이 입력 = 너비계산
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	
	System.out.println("가로길이를 입력하세요");
	int xLength = scn.nextInt();
	
	System.out.println("세로길이를 입력하세요");
	int yLength = scn.nextInt();
	
	int area = (xLength * yLength);
	
	
	System.out.println("너비는" + area + "입니다." );
	
	

	
	
	scn.close();
	
	}
	
	
	
	
	
}

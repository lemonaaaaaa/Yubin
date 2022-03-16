package com.prod;

public class CalExample1 {
	public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.PI);

        int number1 = 10;
        int number2 = 20;//매개값
        //기능을 호출하는 부분에는 실제값.(int를 add뒤에 넣으면안된당...)
        int result = cal.add(number1, number2);
        System.out.println(number1 + " 과 " + number2 + " 의  합은 " + result);
        
        cal.add(number1,  number2);
        cal.minus(number1, number2);
	    int result2 = cal.minus(number1, number2);
	    System.out.println(number1 + " 과 " + number2 + " 의 차는 " + result2);
	
	    cal.getRecArea(number1, number2);
	    double result3 = cal.getRecArea(number1, number2);
	    System.out.println(number1 + " 과 " + number2 + " 의 너비는 " + result3 + "입니다");
	
	
	    double r = 4.5;
	    cal.getCircleArea(r);
	    double result4 = cal.getCircleArea(r);
	    System.out.println("반지름이 " + r + " 일 때  원의 넓이는 " + result4 + " 입니다.");
	
	
	}
}

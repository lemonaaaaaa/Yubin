package com.edu;

public class VariableExample {
     public static void main(String[] args) {
		//변수의 타입.
    	 int num1 = 100;  // 정수는 int  실수는(소수점)  double
	     double num2 = 100.5;
	     double result = num1 * num2; // 10050;처럼 실수로  나올 것 같으나 정수*실수일경우 double로
	     System.out.println("결과" + result ); //두개 변수 중 큰 변수로 바꿔서 연산함-자동형변환(promtion) : 작은범위 ->큰범위
	     
	     // 강제형변환(casting) : 큰범위 -> 작은범위.
	     int val1 = 100;
	     double val2 = 20.5;
	     int sum = val1 + (int) val2;
	     System.out.println("결과" + sum); 
	     
	     int n1 = 11;
	     int n2 = 4;
	     
	    double n3 = n1 / n2; // 10/4 => 2.5 나오려면 결과값을 더블타입으로. int로 결과값 산출하면 소수점 날아감.
	    int n112 = n1 / n2; // 10/4 => 2.5 나오려면 결과값을 더블타입으로. int로 결과값 산출하면 소수점 날아감.
	    System.out.println("나눈결과" + n3 );
	    System.out.println(" = " + n112);
     

		double n5 = (double) n1 / n2; // 더블로 하나를 전환한 경우
	
		System.out.println("더블로 변환하면" + n5);

		//10을 3으로 나눈 나머지 =>1 나머지를 구한다는것은 실수를 구한다는 것(정수를 결과로 받아옴)
		int n4= n1 % n2;
        System.out.println("나머지" + n4);
        
        //짝수, 홀수인지 홀수인지 알고싶따
        if (n1 % 2 == 0);  {
        	 System.out.println(n1 + "의 값은 짝수입니다");
        	 
        }
        
        
        
        
     }
}

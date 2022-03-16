package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "김지찬";
		names[1] = "234";
		names[2] = "강민호";
		names[3] = "원태인"; //배열공간을 5가지로 만들면 초기값 지정을 안해주면 다 null로 뜸
		names[4] = "이승현";		
		
		names[0] = null;
		
		String searchName = "강민호"; //이 이름이 있는 곳을 출력하고싶다
		for(int i=0; i<5; i++) {
			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println("이름은 " + (i + 1)  + " 에 있습니다");
//			}
		
//		
//			for(int i=0; i<5; i++) {
//			if (names[i] != null) { //null이 아닌 경우만 출력하겠다
//				
			
//			System.out.println("이름은 " + names[i] + "입니당");
			}
			
		}
	}
}


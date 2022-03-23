package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = "Hello";
				break;
			}
		}

		ArrayList<String> strAry = new ArrayList<String>();// 클래스라서 생성자()호출
		strAry.add("Hell");
		strAry.add("로");

		strAry.get(1);
		strAry.set(1, "월드");//인덱스1의 위치값을 수정
		strAry.remove(0);// 인덱스 1의 값 삭ㅈㅔ
		strAry.clear();
		System.out.println("strAry의 size는 : " + strAry.size());
		
		
		for (int i = 0; i < strAry.size(); i++) {
			String result = strAry.get(i);
			System.out.println(result);
		}

//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for(int i=0; numAry.size(); i++) {
//			String result = numAry.get(i);
//		}

	}

}

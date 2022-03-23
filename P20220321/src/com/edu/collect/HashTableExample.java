package com.edu.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("카리나", "예쁨");
		map.put("윈터", "내취향");
		map.put("닝닝", "이쁨 근데 중국인사함");
		map.put("지젤", "내취향아님");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름과 키워드를 입력하세요");
			System.out.println("이름 : ");
			String name = scanner.nextLine();
			System.out.println("키워드 : ");
			String keyword = scanner.nextLine();
			
			if(map.containsKey(name)) {
				System.out.println("정답입니당");
				break;
			}else {
				System.out.println("다시생각해보십셔");
			}
		} 
		
	}

}

package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		//Map : {Key:Value}, {key1:value1} 키와 밸류가 쌍으로 묶여서 사용됨- 키에 해당되는 값.
		//키에 해당하는 타입과 밸류의 타입을 각각 선언해줘야함
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("킹지찬", 100);
		map.put("김형민", 44);
		map.put("김영민", 78);
		map.put("김영민", 0);//같은 키값이면 후에 들어온 값으로 대체됨
		//collection : 여러 값을 저장 =>여러요소 접근.
		
		Integer val = map.get("김영민");
		System.out.println(val); //값을 가져올때는 get 입력할때는 put
		
		Set<String> keySet = map.keySet(); // map 컬렉션에 저장된 요소들의 키에 해당 값을 Set 컬렉션에 담아주는것.
		//1)첫번째 방법
		
		Iterator<String> iter = keySet.iterator();
		
		while ( iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key : %5s, value : %5d \n", key, value);
		}System.out.println("------------------------------------------");
		
		//2) for(:) 확장for
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("key : %5s, value : %5d \n", key, value);
			
			
		}System.out.println("=================끗=====================");
		
			
	}

}

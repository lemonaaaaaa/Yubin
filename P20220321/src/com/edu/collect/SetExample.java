package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) { //set collection은 중복값을 받지 않는 집합
		
		Set<String> set = new HashSet<String>(); // Set : 중복값 불허
		set.add("Hell로");
		set.add("세상아");
		set.add("망해라");
		set.add("Hell로"); //중복요소는 추가불가
		
		set.remove("세상아");
		
		
		System.out.println("set크기 : " + set.size());
		
		Iterator<String> iter = set.iterator(); //반복자. 반복되는 요소를 하나씩 끄집어내는
		while(iter.hasNext()){//끄집어낼 요소가 있는지 판별. true와 false
			String result = iter.next();//먼저넣고 안넣고 상관없이 그냥 중복값 없이 순서 지맘대로나옴
			System.out.println(result);

			
			
			
		}System.out.println("=======end========");
	}

}

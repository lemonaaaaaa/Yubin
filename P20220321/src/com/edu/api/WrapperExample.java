package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		//기본타입(int, long, double, boolean 등등
		//참조타입(Integer, Long, Double, Boolean 등등
		//int -> Integer (boxing), 반대의 경우 unboxing 
		
		ArrayList<Integer> ary = new ArrayList<Integer>();//int못들어감. 클래스만 선언 가능.
		ary.add(100);
		ary.add(new Integer(200));//건방지게 줄그은거 에러난건아닌ㄷㅔ 지맘에 안드니까 추후에 지운다는거임
		
		//이런것들을 랩퍼 클래스라고 합니다. ???:그래서 그게 뭔데요ㅕ 어케하는건데요
		//기본타입과 참조타입을 자유롭게 왔다갔다함. 
		//int는 메소드가 없음. Integer은 클래스다보니까 메소드가잇슴
		
		
		new Integer(100).floatValue(); //100.0
	}

}

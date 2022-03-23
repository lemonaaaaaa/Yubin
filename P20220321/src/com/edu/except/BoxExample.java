package com.edu.except;

import java.util.ArrayList;

import com.edu.generic.Box;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hell로");
//		String result = (String) box.getObj();//스트링타입를 스트링으로 받아옴-캐스팅
//		System.out.println(result);
//		Integer result1 = (Integer)box.getObj();//스트링을 -Integer로 받아옴
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("Hell로");
		String result = stringBox.getObj();
		System.out.println(result);
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		Integer result1 = intBox.getObj();
		System.out.println(result1);
		
		
		ArrayList<Integer> intAry = new ArrayList<Integer>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

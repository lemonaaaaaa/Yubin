package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("Orange");
//
//		if (obj1.equals(obj2)) {
//			System.out.println("obj1과 obj2는 동일합니다");
//		} else {
//			System.out.println("obj1과 obj2는 다릅니다");
//		}
//		if (obj1.equals(obj3)) {
//			System.out.println("obj1과 obj2는 동일합니다");
//		} else {
//			System.out.println("obj1과 obj3은 다릅니다");
			
			
		Member m1 = new Member("2번타자","구자욱");
		Member m2 = new Member("2번타자","구자욱");
		
		if(m1 == m2 ) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		} //다르다고 나옴
		
		//배열-단점:크기가 정해져버리면 새로운 배열을 만들어서 기존의 값을 복사해야함
		//컬렉션-배열단점보완(ArrayList, HashSet, HashMap) : 여러개의 값을 가짐
		Member[] MemberAry = new Member[5];//멤버의 인스턴트 최대 5개 저장
		//크기를 초과하면 새로운 배열 선언하고 원래 배열을 복붙해야함 귀찮
		
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1","홍길동"));//hashCode(), equals()
		memList.add(new Member("user1","홍길동"));
		
		for(int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>();//중복값은 저장안함
		memList.add(new Member("user1","홍길동"));//hashCode(), equals()
		memList.add(new Member("user1","홍길동"));
		System.out.println(memSet.size());
		
//		if (m1.equals(m2)) {
//			System.out.println("논리적으로 같습니다");
//		}else {
//			System.out.println("논리적으로 다릅니다");
//		}
		}
	}
//}

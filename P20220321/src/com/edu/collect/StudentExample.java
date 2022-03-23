package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student(58, "김지찬", 78, 88);
		Student s2 = new Student(46, "원태인", 100, 98);
		Student s3 = new Student(00, "뫄뫄", 80, 58);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		Student result = list.get(0);//첫번째 학생정보를 변수에 저
		System.out.println("첫번째 학생 : " + result.toString());
		
		list.set(0, new Student(0, "뫄뫄뫄", 75, 23));
		result = list.get(0);
		
		list .get(0).setStudentKo(100);//첫번쩨 인스턴스의 값을 변경
		list.get(0).setStudentEn(100);
		
		list.remove(0);
		
		
		System.out.println("첫번째 학생 : " + result.toString());
		
	
	
	
	
	
	}
}

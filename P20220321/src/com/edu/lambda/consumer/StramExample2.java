package com.edu.lambda.consumer;

import java.util.ArrayList;
import java.util.List;

public class StramExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("김지찬", "남자", 75));
		list.add(new Student("김동엽", "남자", 0));
		list.add(new Student("이수진", "여자", 45));
		list.add(new Student("이수영", "여자", 52));
	
		//남여 스코어+포인트 > 180 이상인 학생들만 출력
		list.stream()// 스트림 생성
		.filter (student-> student.score>= 180).forEach(student -> System.out.println(student));

list.stream()// 스트림 생성
	.filter (student-> student.score>= 80)
	.filter(student -> student.gender.equals("여자"))
	.forEach(student -> System.out.println(student));
	}

	
				
}

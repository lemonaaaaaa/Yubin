package com.edu.util;

import java.util.ArrayList;
import java.util.List;
import com.edu.collect.Student;

public class StreamExample{
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("김지찬", "남자", 75));
		list.add(new Student("김동엽", "남자", 0));
		list.add(new Student("이수진", "여자", 45));
		list.add(new Student("수아레즈", "남자", 90));

		Stream<Student> stream = list.stream(); // 스트림생성
		stream.forEach(new Consumer<Student>() {

			@Override
			public void accept(student t) {
				System.out.println("이름 : " + t.name + ", 성별 " + t.gender + ", 점수 " + t.score);
			}
		});
	}
}

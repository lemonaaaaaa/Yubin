package com.edu.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {
	String name;
	String gender;
	int score;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
}

public class PredicateExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("김지찬", "남자", 75));
		list.add(new Student("김동엽", "남자", 0));
		list.add(new Student("이수진", "여자", 45));
		list.add(new Student("수아레즈", "남자", 90));
		
		
		list
		.stream().filter(student->student.score+)
		

		// 평균 구하기
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student student : list) {
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}

		avg = sum / (double) cnt;
		System.out.println("컬렉션 평균 : " + avg);

		Stream<Student> stream = list.stream(); // 스트림생성
		OptionalDouble od = stream//
				.filter((s) -> s.gender.equals("남자"))//
				.mapToInt(s -> s.score)//
				.average();

		avg.od.getAsDouble();
		System.out.println("스트림 평균 " + avg);
		
			}
		};
//		double avg = avg(pridic);
//		System.out.println("남학생의 평균 : " + avg);
//		pridic = (s) -> s.gender.equals("여자");
//		avg = avg(pridic);
//		System.out.println("여학생의 평균 : " + avg);
//
//	}
//
//	public static double avg(Predicate<Student> pred) {
//
////
////		int cnt = 0;
////		int sum = 0;
////		double avg = 0;
//
//		for (Student student : list) {
//			if (pred.test(student)) {
//				cnt++;
//				sum += student.score;
//			}
//		}
//
//		avg = sum / (double) cnt;
//		return avg;

	}

}

package com.edu.lambda.consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;

public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (Student) -> {

				(student) -> student.getStudentEn() + student.getStudentKo();
			};

		

	int result = func.applyAsInt(new Student(101, "ㄴㄴㄴ", 80, 90));
System.out.println(result);
	}
}

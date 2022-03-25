package com.edu.Io;

public class Student {// main메소드가 없이 참조형 클ㄹ래스.
	// 학생번호(int 1,2,3) 이름(김지찬) 영어점수 ( 80) 국어(70)

	private int StudentNo;
	private String StudentNa;
	private int StudentEn;
	private int StudentKo;

	public Student() {
	}

	// 생성자: 기본생성자, 매개값이 4개짜리.
	public Student(int StudentNo, String StudentNa, int StudentEn, int StudentKo) {
		this.StudentNo = StudentNo;
		this.StudentNa = StudentNa;
		this.StudentEn = StudentEn;
		this.StudentKo = StudentKo;

	}

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public String getStudentNa() {
		return StudentNa;
	}

	public void setStudentNa(String studentNa) {
		StudentNa = studentNa;
	}

	public int getStudentEn() {
		return StudentEn;
	}

	public void setStudentEn(int studentEn) {
		StudentEn = studentEn;
	}

	public int getStudentKo() {
		return StudentKo;
	}

	public void setStudentKo(int studentKo) {
		StudentKo = studentKo;
	}
	// get, set 생성

	@Override
	public String toString() {

		return "학생정보[학생번호 : " + StudentNo + ", 이름: " + StudentNa + ", 영어점수: " //
				+ StudentEn + ", 국어점수: " + StudentKo + "]";

	}

	public Object getName() {
		
		return null;
	}

}

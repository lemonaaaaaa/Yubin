package com.edu;

public class Student {
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수<-이런정보를 저장할 수 있는 필드 만들어야함
	private int studNo;
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;
	
	
	
	//메소드
	public static void callStatic() {
		System.out.println("정적 메소드 실행!!!!!!!");
	}
	// 영어, 국어, 수학-> 값이 저장되면 평균을
	public double getAvgScore() {
		return this.getSumScore() / 3.0;

	}

	// 생성자: 필드 값 초기화 //초기화 시점에 값을 지정하고싶다면
	public Student() {
		this.studName = "None";
		this.korScore = 0;
		this.engScore = 0;
	}

//	public Student(int stuNo) {
//		this.studNo = studNo;
//	}

	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}

	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	// 영어, 국어, 수학-> 합계점수
	int getSumScore() {
		if (this.korScore != -1 && this.engScore != -1 && this.mathScore != -1) {
			return this.korScore + this.engScore + this.mathScore;

		}
		return -1;
	}

	// 기능(method)-규칙이 있음. 반환값 메소드명 매개변수 { }
	// public: void:
	void setStuNo(int studNo) {
		this.studNo = studNo;
	}

	int getStuNo() {
		return this.studNo;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public String getStudInfo() {
		String str = "=============================";
		str += "\n 학생의 이름은 " + this.getStudName() + "이고";
		str += "\n 학생의 학번은 " + this.getStudNo() + "이고";
		str += "\n 평균은 " + String.format("%.2f", this.getAvgScore()) + "입니다";
		str += "\n================================\n";
		return str;

	}

}

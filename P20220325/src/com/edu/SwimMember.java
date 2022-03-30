package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)

	// 정보출력시 => 강사이름: 홍길동, 등급: A

	private String swimTeacher;
	private String swimGrade;

	public SwimMember(int memberId, String memberName, String phone, String swimTeacher, String swimGrade) {
		super(memberId, memberName, phone);

		this.swimTeacher = swimTeacher;
		this.swimGrade = swimGrade;
	}

	public String getSwimTeacher() {
		return swimTeacher;
	}

	public void setSwimTeacher(String swimTeacher) {
		this.swimTeacher = swimTeacher;
	}

	public String getSwimGrade() {
		return swimGrade;
	}

	public void setSwimGrade(String swimGrade) {
		this.swimGrade = swimGrade;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\n 추가정보 : 강사이름 : " + swimTeacher + "등급 :  " + swimGrade + "\n";
		return info;
	}

}

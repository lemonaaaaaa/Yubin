package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A]

	private String soccerTeacher;
	private String soccerLockNa;

	public SoccerMember(int memberId, String memberName, String phone, String soccerTeacher, String soccerLockNa) {
		super(memberId, memberName, phone);
		this.soccerTeacher = soccerTeacher;
		this.soccerLockNa = soccerLockNa;
	}

	public String getSoccerTeacher() {
		return soccerTeacher;
	}

	public void setSoccerTeacher(String soccerTeacher) {
		this.soccerTeacher = soccerTeacher;
	}

	public String getSoccerLockNa() {
		return soccerLockNa;
	}

	public void setSoccerLockNa(String soccerLockNa) {
		this.soccerLockNa = soccerLockNa;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\n 추가정보 : 강사이름 : " + soccerTeacher + "락커이름 :  " + soccerLockNa + "\n";
		return info;
	}

	
	
}
package com.edu;

public class UnivFriend extends Friend {
//학교이름, 전공

	private String unviversity;
	private String major;

	public UnivFriend() {
		super(); //부모클래스의 생성자를 호출하겠다는 의미 Friend();
	

	}

	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); //부모클래스의 것들
		
	}
	public UnivFriend(String name, int age, double height, double weight, String phone, String university, String major) {
		super(name, age, height, weight, phone); //부모클래스의 것들+ 유니브
		this.unviversity = university;
		this.major = major;
		
		
		
		
		
	}
	public String getUnviversity() {
		return unviversity;
	}

	public void setUnviversity(String unviversity) {
		this.unviversity = unviversity;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다.\n";
		str += "======<추가정보>======\n";
		str += "다니는 학교는 " + this.unviversity + "이고\n";
		str += "전공은 " + this.major + "입니다";
		return str;
	}

	
	
	
	
}

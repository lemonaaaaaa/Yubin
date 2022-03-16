package com.Homeworks;

public class User {

	private String userId;
	private String userGrade;
	private String userPhone;
	private int userPoint;

	public String getuserId() {
		return userId;
	}

	public void setuserId(String userId) {
		this.userId = userId;
	}

	public String getuserGrade() {
		return userGrade;
	}

	public void setuserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getuserPhone() {
		return userPhone;
	}

	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getuserPoint() {
		return userPoint;
	}

	public void setuserPoint(int userPoint) {
		this.userPoint = userPoint;

	}

	public String getUsersInfo() {
		String result = "사용자의 이름은 " +  this.userId + " 등급은 " //
				+ this.userGrade + " 포인트는 " + this.userPoint + " 입니다 ";
		return result;

	}

}

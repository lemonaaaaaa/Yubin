package com.edu;

// 앱이 시작시 맨처음 실행되는 클래스.
public class MemberExe {
	public static void main(String[] args) {
		MemberApp app = new MemberApp(); // 앞의 member 앱이 가지고 있는 excute를 쓰고싶어서 new 머시기에 값이 하나 할당대야댐. 클래스다보니까 new~
		app.execute();
	}
}

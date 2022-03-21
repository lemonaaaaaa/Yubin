package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		Friend f1 = new Friend();
		f1.setName("김지찬");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9415");

		UnivFriend f2 = new UnivFriend("원태인", 23, 178.3, 69.2, "010-1111-2222");
		f2.setUnviversity("개쩌는대학교");
		f2.setMajor("체육특기생");

		ComFriend f3 = new ComFriend("구자욱", 25, 178.3, 68.2, "010-1345-4564", //
				"삼성", "프차스타");

		Friend f4 = new Friend("강민호", 40, 188, 69, "010-1211-2222");

		UnivFriend f5 = new UnivFriend("김민수", 22, 177, 70, "010-2311-2222");
		f5.setUnviversity("개쩌는대학교");
		f5.setMajor("밥먹으러 학교옴");

		ComFriend f6 = new ComFriend("오재일", 37, 190, 80, "010-1454-4564", //
				"삼성", "1루수");

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] instanceof UnivFriend && friends[i] != null) {// uni변수값이 unifriend의 인스턴스인지 확인
				System.out.println(friends[i].toString());
			}
		}
			

//		Friend friend = (Friend) f2; // UnivFrien; getUniversity, getMajor가 안떠용
//		friend = f1;
//		UnivFriend uni = null;
//				uni = (UnivFriend) friend; // 강제형변환(casting)
//				uni.getUnviversity();// 부모클래스의 참조변수=>자식클래스의 참조변수 할당
				


}}

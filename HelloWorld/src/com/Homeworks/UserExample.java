package com.Homeworks;

public class UserExample {

	public static void main(String[] args) {

		User u1 = new User();
		u1.setuserId("김지찬");
		u1.setuserGrade("A");
		u1.setuserPhone("010-1111-2222");
		u1.setuserPoint(30000);

		User u2 = new User();
		u2.setuserId("원태인");
		u2.setuserGrade("A");
		u2.setuserPhone("010-2635-2222");
		u2.setuserPoint(22000);

		User u3 = new User();
		u3.setuserId("박해민");
		u3.setuserGrade("A");
		u3.setuserPhone("010-1868-2222");
		u3.setuserPoint(900);

		User u4 = new User();
		u4.setuserId("이학주");
		u4.setuserGrade("C");
		u4.setuserPhone("010-1111-8888");
		u4.setuserPoint(10000);
		System.out.println(u4.getUsersInfo());
		System.out.println(u1.getUsersInfo());

		User[] users = { u1, u2, u3, u4 };

		for (int i = 0; i < users.length; i++) {
			if (users[i].getuserGrade() == "A" && users[i].getuserPoint() >= 1000) {
				System.out.println("등급이 A 이상이면서 포인트가 1000이상인 사용자는 " + users[i].getuserId());
			}

		}
	}
}

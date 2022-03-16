package com.prod;

public class FriendExample {
 public static void main(String[] args) {
	   //친구의 정보(이름, 전화번호, 이메일, 키, 몸무게
	 Friend f1 = new Friend();
	 f1.friendName = "이유빈";
	 f1.friendPhone = "010-7634-7242";
	 f1.email = "lemona@lemona";
	 f1.height = 160.1;
	 f1.weight = 200;
	 
	 Friend f2 = new Friend();
	 f2.friendName = "이세빈";
	 f2.friendPhone = "010-4255-3791";
	 f2.email = "lemona@lemonaa";
	 f2.height = 175;
	 f2.weight = 100;
	 
	 Friend f3 = new Friend();
	 f3.friendName = "김지찬";
	 f3.friendPhone = "010-4555-3791";
	 f3.email = "lemonaaa@lemonaa";
	 f3.height = 180;
	 f3.weight = 150;
	 
	 Friend[] friends = {f1, f2, f3};
	 
	 for(int i = 0; i < friends.length; i++) {
		
		 if(friends[i].height > 165) {
		 System.out.println("이름은 " + friends[i].friendName);
		 System.out.println("전화번호 " + friends[i].friendPhone);
		 System.out.println("이메일은 " + friends[i].email);
		 System.out.println("키는 " + friends[i].height);
		 System.out.println("몸무게는 " + friends[i].weight);
		 System.out.println("=================================");
	 }
	 
	 }
	 
}
}

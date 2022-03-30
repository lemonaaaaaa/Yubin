package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
	private String bookKing;
	private String bookRoom;

	public BookMember(int memberId, String memberName, String phone, String bookKing, String bookRoom) {

		super(101, "James", "29229");

		this.bookKing = bookKing;
		this.bookRoom = bookRoom;
	}

//정보출력시 반장이름, 강의실.
	@Override
	public String toString() {
		String info = super.toString(); // 부모클래스(Member) id, name, phone
		info += "\n 추가정보 : 반장이름 : " + bookKing + "강의실 :  " + bookRoom + "\n";
		return info;
	}

}
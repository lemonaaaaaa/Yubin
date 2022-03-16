package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책 제목 저자 출판사 가격

		Book b1 = new Book();
		b1.bookName = "혼공자";
		b1.bookWriter = "신용권";
		b1.bookPrint = "한빛미디어";
		b1.bookPrice = 24000;

		Book b2 = new Book();
		b2.bookName = "powerJava";
		b2.bookWriter = "천인국";
		b2.bookPrint = "인피니티";
		b2.bookPrice = 35000;

		Book b3 = new Book();
		b3.bookName = "재미있는 Java";
		b3.bookWriter = "이호준";
		b3.bookPrint = "인피니티";
		b3.bookPrice = 20000;

		Book[] books = { b1, b2, b3 };
		// 책 제목, 저자, 가격 => 출력.

		for (int i = 0; i < books.length; i++) {

//			if(books[i].bookPrint == "인피니티") {
//			
//			System.out.println("책 제목은 " + books[i].bookName + " 저자는 " + books[i].bookWriter + " 가격은 " + books[i].bookPrice + " 입니다." );
			if (books[i].bookWriter == "신용권") {

				System.out.println("책 제목은 " + books[i].bookName + " 입니다." );
			}

		}
	}
}

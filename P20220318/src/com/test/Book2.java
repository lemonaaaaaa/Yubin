package com.test;

public class Book2 {

	private String bookName;
	private String bookWriter;
	private String bookPrint;
	private int bookPrice;

	public Book2(String bookName, String bookWriter, //
			String bookPrint, int bookPrice){
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookPrint = bookPrint;
		this.bookPrice = bookPrice;

	}

	public void showInfo() {
		System.out.printf("책정보 [제목: %-10s 저자 %-10s 출판사 %-10s 가격 %5d]\n",//
				bookName, bookWriter, bookPrint, bookPrice);
	}
}

package com.test;

public class Book {

	private String bookName;
	private String bookWriter;
	private String bookPrint;
	private int bookPrice;

	public Book(String bookName, String bookWriter, String bookPrint, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookPrint = bookPrint;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookPrint() {
		return bookPrint;
	}

	public void setBookPrint(String bookPrint) {
		this.bookPrint = bookPrint;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	

}

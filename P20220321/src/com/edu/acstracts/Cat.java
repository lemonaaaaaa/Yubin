package com.edu.acstracts;

public class Cat extends Animal{

	public Cat() {
		super();
		System.out.println("Cat() 생성자 호출");
	}
	@Override
	public void eat() {
		System.out.println("애옹이가 먹습니다");
		
	}

	@Override
	public void speak() {
		System.out.println("애옹이가 애옹앵옹");
		
	}
	
	

}

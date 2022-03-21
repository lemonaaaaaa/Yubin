package com.edu.acstracts;

public class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Dog() 생성자 호출");
	}

	@Override
	public void eat() {
		System.out.println("망뭉이가 먹습니다.");

	}

	@Override
	public void speak() {
		System.out.println("망뭉이가 멍멍멍.");

	}

}

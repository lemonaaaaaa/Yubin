package com.edu.acstracts;

public abstract class Animal {//추상클래스는 자식 클래스를 통해서만 실체가 존재(상속을 통해서만)
	//어떤 기능을 반드시 자식놈들이 가지고 있어야 함.


	private String name;

	public Animal() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//추상메소드 정의
	public abstract void eat();
	public abstract void speak();

}

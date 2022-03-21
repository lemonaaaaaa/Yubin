package com.edu.acstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스는 instance를 생성불가...
	Animal animal = null;
	animal = new Dog();
	animal.setName("망뭉이");
	animal.eat();
	animal.speak();

	animal = new Cat();
	animal.setName("리리");
	animal.eat();
	animal.speak(); //메소드는 똑같은데 어떤 인스턴스가 담겨있느냐에 따라 다른 값이 출력됨.
		
	}

}

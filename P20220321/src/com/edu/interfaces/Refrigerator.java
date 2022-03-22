package com.edu.interfaces;

public class Refrigerator implements RemoteControl {
	public void on() {
		System.out.println("냉장고를 켭니당");
		
	}

	public void off() {
		System.out.println("냉장고 꺼짐 이제 음식 다 상함 ㅜㅜ ");
	}

	@Override
	public void powerOn() {
		System.out.println("냉장고를 켭니당");
		
	}

	@Override
	public void powerOff() {
		System.out.println("냉장고 꺼짐 이제 음식 다 상함 ㅜㅜ ");
		
	}
	
	
	
}
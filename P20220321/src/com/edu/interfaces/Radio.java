package com.edu.interfaces;

public class Radio implements RemoteControl {
	public void turnOn() {
		System.out.println("라디오켯슴");
	}

	public void turnOff() {
		System.out.println("라디오 꺼졍");
	}

	@Override
	public void powerOn() {
		System.out.println("라디오켯슴");
		
	}

	@Override
	public void powerOff() {
		System.out.println("라디오 꺼졍");
		
	}
	
	
	
	

}

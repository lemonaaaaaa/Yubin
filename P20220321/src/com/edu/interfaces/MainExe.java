package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		// 리모콘 -> TV, RAdio, 냉장고
		RemoteControl rm = new TV();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Refrigerator();
		rm.powerOn();
		rm.powerOff();

		
		
		
		
		
		
		
		
	}
}

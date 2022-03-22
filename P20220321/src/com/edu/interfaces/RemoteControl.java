package com.edu.interfaces;

public interface RemoteControl {// 클래스처럼 보이지만 따로 필드가 없고 기능만을 가짐//구현객체
//필드도 불가
//private String maxVolume;
	//static:클래스에 소속되어있는 값. 인터페이스에 소속되어있는값. 바꾸지않겟따-final
	public static final int MAX_VOLUME = 10;// 상수로 선언
	public static final int MIN_VOLUME = 0; //상수로 선언

	//생성자불가

	public void powerOn();//추상메소드

	public void powerOff();

}

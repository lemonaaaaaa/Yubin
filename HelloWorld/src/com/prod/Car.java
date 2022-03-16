package com.prod;

public class Car {
//모델, 현재속도, 최고속도, 가속(10씩 증가), 감속(10씩 감속), 현재속도
	// ()있는건 메소드로
	private String model;
	private int speed;
	private int maxSpeed;// 필드. 값을 담기 위한 용도

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 >= this.maxSpeed) {
			System.out.println("최고속도를 초과할 수 없습니다");
			return;//반복문의 컨티뉴 처럼 아래를 실행하지 않고 종료.
		}
		System.out.println("10km 가속합니다");
		this.speed += 10; // 현재속도에 10을 증가시기는 method
	}

	public void breakSpeed() {
		if(this.speed - 10 < 0) {
			System.out.println("집에 안갈겁니까?");
			return;
		}
		System.out.println("10km 감속합니다");
		this.speed -= 10;
	}

	public int getSpeed() {
		return this.speed;
	}

}

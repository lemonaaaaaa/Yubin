package com.edu;

public class Vehicle  {

	private int maxSpeed;

	public Vehicle() {
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		System.out.println("탈것이 달립니다");
	}

	public void stop() {
		System.out.println("탈것이 멈춥니다");
		
		
		}
	
	@Override
	public String toString() {
		return "탈것의 최고속도는 " + this.maxSpeed + "입니다";
}
}
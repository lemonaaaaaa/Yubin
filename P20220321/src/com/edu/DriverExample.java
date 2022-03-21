package com.edu;

public class DriverExample {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성.
		// 똑같은 실행코드인데 결과는 인스턴트가 비히클인지 택시인지에 따라 실행결과가 다름.

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println("Vehicle의 최고속력은 " + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고속력은 " + taxi.getMaxSpeed());
		System.out.println("Bus의 최고속력은 " + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		// 속도가 제일 빠른 탈것의 값부터 정렬해서 vehicles[0]에 택시 vehicles[1]버스 그다음 vehicle
		// 할줄..모르겟는뎅...?
		// if(intAry[i]> intAry[i+1])
		// if(vehivles[i].getMaxSpeed() 크다 작다 비교해서 위치 변경
		int loopCnt = vehicles.length - 1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {

			int temp = vehicles[0].getMaxSpeed();

			for (int i = 0; i < loopCnt; i++) {
				if (vehicles[i].getMaxSpeed() < vehicles[i + 1].getMaxSpeed()) {
					temp = vehicles[i].getMaxSpeed();
					vehicles[i].setMaxSpeed(vehicles[i + 1].getMaxSpeed());
					vehicles[i + 1].setMaxSpeed(temp);
				}
			}
		}
		System.out.println("순서" + vehicles[0].getMaxSpeed()+"," + vehicles[1].getMaxSpeed()+ "," + vehicles[2].getMaxSpeed());
		
		System.out.println("================================================");
		
		System.out.println(vehicles[0].getMaxSpeed()); 
		System.out.println(vehicles[1].getMaxSpeed());
		System.out.println(vehicles[2].getMaxSpeed());
		
		System.out.println("================================================");
		
		System.out.println("제일빠른것 " + vehicles[0].toString()); //택시의 최고속도는 120입니다
		System.out.println("타면 집에못감" + vehicles[2].toString()); //vehicle의 최고속도는 100입니다.
		
	}
}

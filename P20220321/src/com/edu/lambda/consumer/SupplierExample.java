package com.edu.lambda.consumer;

import java.util.function.IntSupplier;

//SUPPLIER 인터페이스 : 매개값x 반환값 o // int타입을 리턴해주게따
public class SupplierExample {
	public static void main(String[] args) {
	
		//IntSupplier intSup = new IntSupplier() {
//			@Override
//			public int getAsInt() {
//				return (int) (Math.random()* 10);
//				
		
		
		
		IntSupplier intSup = () -> (int) (Math.random()* 10);
		int result = intSup.getAsInt();
				System.out.println("결과값은 "+result);
				
			}
	
		

	}

package com.edu.lambda.consumer;

import java.util.function.*;
import java.util.function.Consumer;

public class CounsumerExample {
	public static void main(String[] args) {
		//함수적 인터페이스 : 람다표현식으로 가능
		Consumer<String> consumer = (t) ->{
			System.out.println(t + " 출력 ");

		};
		consumer.accept("메세지를 ");
		
		BiConsumer<Integer, Integer> biCon = new BiConsumer<Integer, Integer>() {
				
			};
			
			
			BiConsumer<Integer, Integer> bicCon = t + u
	System.out.println("result = "+( t + u ));

}

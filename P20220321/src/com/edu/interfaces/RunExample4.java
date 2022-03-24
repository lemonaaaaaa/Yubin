package com.edu.interfaces;

interface Runnable4 {
	public int run();
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);//매개값없음. 매스랜덤을 정의해서 러너블에 넣겠따
			//(int)강제현변환
		};
		int result = runnable.run();
		System.out.println(result);
	}

}

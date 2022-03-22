package com.edu.nested;

public class Outer {
	//
	private String field1;
	private int field2;

	class Inner {// 멤버 클래스 내부에서 만들어진 클래스는 호출이 가능
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}
	}
	//함수적 인터페이스: 구현해야 할 메소드가 하나인것.
	interface Runnable{
		void run();
		
		
	}
	
	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println(" 나는 지금 이게 이해가 안간ㄷ. 나는 깡통이다 깡깡깡 " + " Bus가 달립니다");
			
		}
		
		
		
	}

	public String getField1() {
		return field1;
	}

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();

	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local {// 메소드 안에 또 클래스 생성 가능 - 로컬 클래스

			void method4() {
				System.out.println("Local.method4()");

			}
		}
		Local local = new Local();
		local.method4();
	}
		public void method4() {
			Runnable runnable = new Bus();// 인터페이스의 구현객체 기능
			runnable.run();
			
			//익명구현객체
			//Lambda 표현식
			runnable = new Runnable() {//러너블이라는 구현객체를 여기서 바로 선언하겟따 - 일회성임
				@Override
				public void run() {
					 System.out.println("임의의 객체의 실행합니다가 문법적으로 맞는 문장인가?");
				}//익명구현객체 기억. 메소드 안에서만 선언 가능.
				
			};
		
			runnable.run();
		}

	}



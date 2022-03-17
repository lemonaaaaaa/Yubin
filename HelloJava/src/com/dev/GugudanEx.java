package com.dev;

public class GugudanEx {
	public static void getScore() { // void 앞에 static이 있으면 인스턴스를 안해도(초기값을 설정 안해도) 바로 가져옴

	}
	
	public static void main(String[] args) {
		int result = sum(sum(10,20), sum(5,7));
		int[]newAry = { 10, 20, 30};
		result = sum(newAry);
		System.out.println("결과는 " + result);
	}
	public static int sum(int[] ary) {
		//배열매개변수의 각 요소의 합을 구하는 메소드
		int sum = 0;
		for(int i = 0; i <ary.length; i++) {
			sum += ary[i];
					
		}return sum;
		
		
	}
	
	
	
	//나누기 메소드(int, int)
	public static double devide(int n1, int n2) {
		if (n2== 0) {
			return 0;
		}
		return n1 / (double) n2;
		
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
		
	}

	public static void printstar(int runCnt, String shape) {
			for(int i = 0; i<runCnt; i++) {
			System.out.println();
	
	}

	public static void gogodan(int dan) {
		System.out.println("[" + dan + "단]");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, (i * dan));
		}
		System.out.println();

	}

	public static void Gugudan() {
		// static 정적.method실행하려면 new 클래스이름(); ex) Student s1 = new Student();
		// Student.callStatic();
		for (int n = 2; n <= 9; n++) {
			System.out.print("[" + n + "단]\t");
		}

		System.out.println();
		for (int n = 2; n <= 9; n++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + n + "=" + n * i + "\t");
			}
			System.out.println();

		}
	}// end of 구구단

//	public static void main(String[] args) {
//		printstar(10, "ㅗㅗ");
//		gogodan(3);

	}// end of program

}

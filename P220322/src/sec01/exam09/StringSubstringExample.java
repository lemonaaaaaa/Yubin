package sec01.exam09;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);//문자열의 7번 이후부터 출력
		System.out.println(secondNum);
	}

}

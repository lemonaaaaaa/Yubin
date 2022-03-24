package sec01.exam09;

public class StringValueOFExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}//ValueOf는 ()안의 값을 대응하는 값으로 바꿔준다. 타입상관없이

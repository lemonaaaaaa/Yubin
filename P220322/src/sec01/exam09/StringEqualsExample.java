package sec01.exam09;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("김지찬");
		String strVar2 = "김지찬";
		
		if(strVar1==strVar2) {
			System.out.println("같은 Sting 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");			
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
	}
}

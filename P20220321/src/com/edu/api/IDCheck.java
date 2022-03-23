package com.edu.api;

public class IDCheck {
//	 주민번호 입력 -> 950304-1234567, 000205-567890
//	 950304-1234567, 띄어쓰기한것, 띄어쓰기 안한것
//	 Sting getGender() ->남 여
	public String getGender(String gen) {

		String result = "";

		if (gen.length() == 14) {
			if (gen.charAt(7) == '1') {
				result = "남자입니다";
			} else if (gen.charAt(7) == '3') {
				result = "남자입니다";
			} else if (gen.charAt(7) == '2') {
				result = "여자입니다";
			} else if (gen.charAt(7) == '4') {
				result = "여자입니다";
			} else{
				result = "잘못된 값입니다.";

			}
		} else if (gen.length() == 13) {
			if (gen.charAt(6) == '1') {
				result = "남자입니다";
			} else if (gen.charAt(6) == '3') {
				result = "남자입니다";
			} else if (gen.charAt(6) == '2') {
				result = "여자입니다";
			} else if (gen.charAt(6) == '4') {
				result = "여자입니다";
			} else{
				result = "잘못된 값입니다.";

			}return result;
			
		}
		return result;
	}

}

////교수님 코드
//	public String getGender(String sno) {
//		String result = null; // 초기화
//		if (sno.length() == 14) {
//			char no = sno.charAt(7);
//			if (no == '1' || no == '3') {
//				result = "남자입니다";
//			} else if (sno.length() == 14) {
//				char no2 = sno.charAt(7);
//				if (no2 == '2' || no2 == '4') {
//					result = "여자입니다";
//				} else {
//					result = " 제대로 입력하세요";
//				}
//			}
//
//		}
//		if (sno.length() == 13) {
//			char no = sno.charAt(6);
//			if (no == '1' || no == '3') {
//				result = "남자입니다";
//			} else if (sno.length() == 13) {
//				char no2 = sno.charAt(6);
//				if (no2 == '2' || no2 == '4') {
//					result = "여자입니다";
//				} else {
//					result = " 제대로 입력하세요";
//				}
//			}
//
//		}
//	}
//}
package example.senderid;

import java.util.HashMap;

import org.json.simple.JSONObject;

import common.Coolsms;

/*
 * Register(발신번호 등록) 예제입니다.
 */
public class RegisterExample {
	public static void main(String[] args) {
		/*
		 * 서버에서 받은 API_KEY, API_SECRET를 입력해주세요.
		 */
		String api_key = "1CS5588FB7DE511A";
		String api_secret = "4FB5FF8B9AB7D0E0AEB840D404DE0F4";
		Coolsms coolsms = new Coolsms(api_key, api_secret);
	
		/*
		 * Parameters
		 * 관련정보 : http://www.coolsms.co.kr/SenderID_API#POSTregister
		 */
		HashMap<String, String> set = new HashMap<String, String>();
		set.put("phone", "01000000000"); // 등록할 발신번호
		
		JSONObject result = coolsms.register(set); // 발신번호 등록요청
		if ((Boolean) result.get("status") == true) {
			// 성공 및 전송결과 출력
			System.out.println("성공");			
			System.out.println(result.toString());
			System.out.println(result.get("handle_key")); // 그룹아이디
			System.out.println(result.get("ars_number")); // 결과코드
		} else {
			// 실패
			System.out.println("실패");
			System.out.println(result.get("code")); // REST API 에러코드
			System.out.println(result.get("message")); // 에러메시지
		}		
	}	
}

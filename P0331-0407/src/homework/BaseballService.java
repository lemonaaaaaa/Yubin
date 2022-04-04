package homework;

import java.util.List;

public interface BaseballService {
	
	public void login(Login login);//로그인 기능 메뉴 1-1, 1-2
	
	public void logout(Login login);//비밀번호로 로그아웃 기능 2-9s
	
	public void postAPost(Baseball baseball); //입력 2-1
	
	public Baseball getPostName(String name);//제목으로 조회 2-3
	
	public List<Baseball> baseballList(); //전체목록 조회 2-2
	
	public void modifyBaseballName(Baseball baseball); 
	//게시글 번호로 조회해서 제목 및 내용 수정 2-4
	
	
	void deleteBaseballPostNo(int postNo); //게시글 번호로 삭제 2-5
	
    





	
	
	
}

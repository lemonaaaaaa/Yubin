

import java.util.List;

public interface BaseballService {

	public int login(String identify, String pass);// 로그인 기능 메뉴 1-1

	

	public void postAPost(BaseballGall baseball); // 입력 2-1

	public BaseballGall getPostNo(int postNo);// 게시글번호 으로 조회 2-3

	public List<BaseballGall> baseballList(); // 전체목록 조회 2-2

	public void modifyBaseballName(BaseballGall baseball);
	// 게시글 번호로 조회해서 제목 및 내용 수정 2-4

	void deleteBaseballPostNo(int postNo); // 게시글 번호로 삭제 2-5

	public int addBaseBallMem(Login login); // 회원등록 1-2

	public int deleteBaseballMem(String identify, String pass); // 회원탈퇴

	public int findIdentify(String identify);//아이디가 이미 존재하는지 검색



	

}

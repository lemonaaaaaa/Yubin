package homework;

import java.util.List;

public interface BaseballService {
	
	public void postAPost(Baseball baseball); //입력
	
	public Baseball getPostName(String name);//제목으로 조회
	
	public List<Baseball> baseballList(); //전체목록 조회
	
	public void modifyBaseballName(Baseball baseball); 
	//제목으로 조회해서 제목 및 내용 수정
	
	
	void deleteBaseballName(String name); //게시글 제목으로 삭제
	
	void deleteBaseballPer(String per); //게시글 작성자로 삭제
	
}

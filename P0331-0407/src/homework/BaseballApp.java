package homework;

import java.util.*;

public class BaseballApp {

	List<Baseball> list = new ArrayList<Baseball>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public BaseballApp() {

	}

	class BaseballServiceN implements BaseballService {

		@Override
		public void postAPost(Baseball baseball) {
			list.add(baseball); // 게시글 추가
		}

		@Override
		public Baseball getPostName(String name) {// 제목으로 조회
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPostName() == name) {
					return list.get(i);
				}
			}

			return null;
		}

		@Override
		public List<Baseball> baseballList() {// 전체리스트 조회

			return list;
		}

		@Override // 게시글 제목으로 조회해서 제목과 내용 수정
		public void modifyBaseballName(Baseball baseball) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPostName() == baseball.getPostName()) {
					list.get(i).setPostName(baseball.getPostName());
					list.get(i).setPostNae(baseball.getPostNae());
				}
			}

		}

		@Override // 게시글 제목으로 삭제
		public void deleteBaseballName(String name) {
			System.out.println("삭제하려는 게시글 제목을 입력하세용>>");
			name = scn.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPostName() == name) {
					list.remove(i);
					System.out.println("게시글이 삭제되었습니다!");
				} else if (list.get(i).getPostName() != name) {
					System.out.println("어..그런 제목은 없는데요?");
				}
			}

		}

		@Override // 게시글 작성자로 삭제
		public void deleteBaseballPer(String per) {
			System.out.println("삭제하려는 게시글의 작성자를 입력하세요>>");
			per = scn.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPostPer() == per) {
					list.remove(i);
					System.out.println("해당 작성자의 게시글이 삭제되었습니다!");
				} else if (list.get(i).getPostPer() != per) {
					System.out.println("해당 작성자는 존재하지 않습니다");
				}
			}
		}

	}

	// 메인기능!!
	BaseballService service = new BasevallServiceN();
	service = new BaseballService

}

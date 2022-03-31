package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballApp  extends connection implements BaseballService{
	

	List<Baseball> list = new ArrayList<Baseball>();
	String[] logins = new String[100]; //로그인정보 배열 지정
	ArrayList<String[]> list2 = new ArrayList<String[]();;
	list2.add("Kingjichan", "318");
	
	

	Scanner scn = new Scanner(System.in);

	// 생성자
	public BaseballApp() {

	}

	class BaseballService implements BaseballService {

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

		@Override // 게시글 번호로 조회해서 제목과 내용 수정
		public void modifyBaseballName(int pno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPostNo() == baseball.getPostNo()) {
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

	public void execute() {
		conn = getConnect();
		BaseballService service = new BaseballServiceN();
		service = new BaseballServiceFile();
		service = new BaseballServiceFile();
		// 메뉴 : 1. 로그인 2. 종료
		// 메뉴2 : (로그인 후) 1. 입력 2.전체목록조회 3. 제목으로 조회 4. 게시글 번호 조회로 수정 //
		// 5. 게시글 제목으로 삭제 6. 게시글 작성자로 삭제 9. 로그아웃
		while (true) {
			System.out.println("메뉴 : 1. 로그인 2. 종료 ");
			System.out.println("선택 >> ");

			int menu = scn.nextInt();
			if (menu == 1) {//로그인 기능
				System.out.println("ID 입력>>");
				String ID = scn.next();
				System.out.println("PW 입력>>");
				int PW = scn.nextInt();
				
				}
				
				
				// 로그인 이후 메뉴2
				System.out.println("메뉴 : 1. 게시글입력 2. 전체목록조희 3. 제목으로 조회"
						+ "4. 수정 5. 삭제 6. 로그아웃");
				System.out.println("선택 >> ");
				int menu2 = scn.nextInt();
				if (menu2 == 1) {// 게시글 입력
					
				} else if (menu2 == 2) {// 전체목록 조회
					
				} else if (menu2 == 3) {// 제목으로 조회
					
				} else if (menu2 == 4) {// 게시글 번호 조회로 제목 및 내용 수정
					
				} else if (menu2 == 5) {// 게시글 제목으로 삭제
					
				} else if (menu2 == 6) {// 게시글 작성자로 삭제
					
				} else if (menu2 == 9) {// 로그아웃 및 종료
					
				}

			} else if (menu == 2) {
				// 로그인 없이 종료
			}

		} // end of while

	}// end of excute

}// class

package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballApp extends DAO{

	List<Baseball> list = new ArrayList<Baseball>();
	List<Login> list2 = new ArrayList<Login>();//

	Scanner scn = new Scanner(System.in);

	// 생성자
	public BaseballApp() {

	}

//	
	// 메인기능!!

	public void execute() {
		conn = getConnect();
		BaseballService service = new BaseballServiceFile();
		// 메뉴 : 1. 로그인 2. 종료
		// 메뉴2 : (로그인 후) 1. 입력 2.전체목록조회 3. 제목으로 조회 4. 게시글 번호 조회로 수정 //
		// 5. 게시글 제목으로 삭제 6. 게시글 작성자로 삭제 9. 로그아웃
		while (true) {
			System.out.println("메뉴 : 1. 로그인 2.회원가입 3.탈퇴 9. 종료 ");
			System.out.println("선택 >> ");

			int menu = scn.nextInt();
			if (menu == 1) {// 로그인 기능
				System.out.println("ID 입력>>");
				String ID = scn.next();
				System.out.println("PW 입력>>");
				int PW = scn.nextInt();

				// 로그인 이후 메뉴2
				System.out.println("메뉴 : 1. 게시글입력 2. 전체목록조희 3. 제목으로 조회" + "4. 수정 5. 삭제 6. 로그아웃");
				System.out.println("선택 >> ");
				int menu2 = scn.nextInt();
				if (menu2 == 1) {// 게시글 입력
					// *자동으로 사용자 이름, 작성일 등록되도록 기능추가 필요
					System.out.println("게시글 제목 >>");
					String postName = scn.next();
					System.out.println("게시글 내용 >>");
					String postNae = scn.next();

					Baseball b1 = new Baseball(0, postName, postNae, null, null, null, 0);
					service.postAPost(b1);

				} else if (menu2 == 2) {// 전체목록 조회

					List<Baseball> list = service.baseballList();
					for (Baseball s : list) {
						System.out.println(s.toString());
					}
				} else if (menu2 == 3) {// 제목으로 내용을 조회
					System.out.println("조회할 제목을 입력>>");
					String postName = scn.next();
					Baseball baseball = service.getPostName(postName);
					if (postName == null) {
						System.out.println("해당되는 제목의 게시글이 없습니다");
					} else {
						System.out.println(baseball.toString());

					}

				} else if (menu2 == 4) {// 게시글 번호 조회로 제목 및 내용 수정
					System.out.println("수정할 게시글의 번호 입력 >> ");
					int postNo = scn.nextInt();
					System.out.println("수정할 제목 입력 >> ");
					String postName = scn.next();
					System.out.println("수정할 내용 입력 >> ");
					String postNae = scn.next();

					Baseball b1 = new Baseball(0, postName, postNae, null, null, null, 0);
					service.modifyBaseballName(b1);
					System.out.println("수정되었습니다");

				} else if (menu2 == 5) {// 게시글 제목으로 삭제
					System.out.println("삭제하려는 게시글의 제목을 입력해주세요");
					String name = scn.next();
//					List<Baseball> list = service.deleteBaseballName(name);
//					for (Baseball b : list) {
//						System.out.println(b.toString());
//					}
					service.deleteBaseballName(name);

				} else if (menu2 == 6) {// 게시글 작성자로 삭제
					System.out.println("삭제하려는 작성자의 이름을 입력해주세요");
					String per = scn.next();
//					List<Baseball> list = service.deleteBaseballPer(per);
//					for (Baseball b : list) {
//						System.out.println(b.toString());
//					}
					service.deleteBaseballPer(per);

				} else if (menu2 == 9) {// 로그아웃 및 종료
					System.err.println("종료합니다");
					break;

				}

			} else if (menu == 3) {// 회원탈퇴

			} else if (menu == 9) {
				// 로그인 없이 종료
			}

		} // end of while

	}// end of excute

}// class

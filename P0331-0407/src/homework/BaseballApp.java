package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballApp extends DAO {

	List<BaseballGall> list = new ArrayList<BaseballGall>();
	List<Login> list2 = new ArrayList<Login>();//

	Scanner scn = new Scanner(System.in);

	// 생성자
	public BaseballApp() {

	}

	// 메인기능!!

	public void execute() {
		conn = getConnect();
		BaseballService service = new BaseballOracle();
//		 메뉴 : 1. 로그인 2.회원가입 3.회원탈퇴 9. 종료
//		 메뉴2 : (로그인 후) 1. 입력 2.전체목록조회 3. 게시글 번호로 조회 4. 게시글 번호 조회로 수정 //
//		 5. 게시글 번호로 삭제 9. 로그아웃
		while (true) {
//			System.out.println("메뉴 : 1. 로그인 2.회원가입 3.탈퇴 9. 종료 ");
//			System.out.println("선택 >> ");

//			int menu = scn.nextInt();
//			if (menu == 1) {// 로그인 기능
//				System.out.println("ID 입력>>");
//				String ID = scn.next();
//				System.out.println("PW 입력>>");
//				int PW = scn.nextInt();
//				int result = 0;
//
//				if (result == 1) {
//					System.out.println("로그인 되었습니다");
//				} else if (result == 0) {
//					System.out.println("로그인 실패.");
//				}
//				service.login(Login);
			// 로그인 이후 메뉴2
			System.out.println("메뉴 : 1. 게시글입력 2. 전체목록조희 3. 게시글 번호로 조회" + "4. 수정 5. 삭제 9. 로그아웃");
			System.out.println("선택 >> ");
			int menu2 = scn.nextInt();
			if (menu2 == 1) {// 게시글 입력
				// *자동으로 사용자 이름, 작성일 등록되도록 기능추가 필요
				System.out.println("게시글 제목 >>");
				String postName = scn.next();
				System.out.println("게시글 내용 >>");
				String postNae = scn.next();

				
				BaseballGall b1 = new BaseballGall(0, postName, postNae, null, null);
				
				service.postAPost(b1);

			} else if (menu2 == 2) {// 전체목록 조회

				List<BaseballGall> list = service.baseballList();
				for (BaseballGall s : list) {
					System.out.println(s.toString());

				}
			}

			else if (menu2 == 3) {//번호로 내용을 조회
				System.out.println("조회할 게시글 번호를 입력>>");
				int postNo = scn.nextInt();

				BaseballGall baseball = service.getPostNo(postNo);
				if (postNo == 0) {
					System.out.println("해당되는 번호의 게시글이 없습니다");
				} else  {
					System.out.println(baseball.toString());
//					service.getPostNo(postNo);
				}	

			} else if (menu2 == 4) {// 게시글 번호 조회로 제목 및 내용 수정
				System.out.println("수정할 게시글의 번호 입력 >> ");
				int postNo = scn.nextInt();
				System.out.println("수정할 제목 입력 >> ");
				String postName = scn.next();
				System.out.println("수정할 내용 입력 >> ");
				String postNae = scn.next();

				
				BaseballGall b1 = new BaseballGall(postNo, postName, postNae, null, null);
				service.modifyBaseballName(b1);
				System.out.println("수정되었습니다");

			} else if (menu2 == 5) {// 게시글 번호로 삭제
				System.out.println("삭제하려는 게시글의 번호를 입력해주세요");
				int postNo = scn.nextInt();
//					List<Baseball> list = service.deleteBaseballName(name);
//					for (Baseball b : list) {
//						System.out.println(b.toString());
//					}
				for (int i = 0; i < list.size(); i++) {
					if (postNo == 0) {
						System.out.println("존재하지 않는 게시글 번호입니다");
					} else {
						continue;
					}
				}
				service.deleteBaseballPostNo(postNo);

			} else if (menu2 == 9) {// 로그아웃 및 종료
				System.err.println("종료합니다");
				break;

			}

//			} else if (menu == 2) {// 회원가입
//
//				System.out.println("가입할 아이디를 입력해주세요");
//				String ID = scn.next();
//				System.out.println("가입할 비밀번호를 입력해주세요");
//				String PW = scn.next();
//
//				((Login) list2).setIdentify(ID);
//				((Login) list2).setPass(PW);
//
//				service.addBaseBallMem(ID, PW);
//
//			} else if (menu == 3) {// 회원탈퇴
//				System.out.println("탈퇴할 아이디를 입력해주세요");
//				String ID = scn.next();
//				System.out.println("탈퇴할 비밀번호를 입력해주세요");
//				String PW = scn.next();
//				service.deleteBaseballName(ID);
//				service.deleteBaseballName(PW);
//
//			} else if (menu == 9) {
//				// 로그인 없이 종료
//
//			}

		} // end of while

	}// end of excute

}// class

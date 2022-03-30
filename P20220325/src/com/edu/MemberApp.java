package com.edu;

import java.util.*;

public class MemberApp {
	// 필드만 있고,
	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

// 생성자
	class MemberServiceImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {
			for (Member mbr : members) {
				if (mbr.getMemberId() == member.getMemberId()) {
					mbr.setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Member> memberList() {

			return members;
		}

	}

	public void execute() {

		MemberService service = new MemberServiceImpl();

		while (true)

		{
			int menu = scn.nextInt();//

			System.out.println("이름을 입력해주세요");
			String memberName = scn.next();
			System.out.println("ID를 입력하세요");
			int memberId = scn.nextInt();
			System.out.println("전화번호를 입력하세요");
			String phone = scn.next();

			if (menu == 1) {
				System.out.println("1.도서회원 2. 축구 3. 수영");
				int menu2 = scn.nextInt();
				if (menu2 == 1) {
					System.out.println("반장이름 입력");
					String bookKing = scn.next();
					System.out.println("강의실 입력");
					String bookRoom = scn.next();
					BookMember mem = new BookMember(memberId, memberName, phone, bookKing, bookRoom);
					service.addMember(mem);// 부모 > 자식

				} else if (menu2 == 2) {
					System.out.println("코치이름 입력");
					String soccerTeacher = scn.next();
					System.out.println("락커룸 이름 입력");
					String soccerLockNa = scn.next();
					SoccerMember mem2 = new SoccerMember(memberId, memberName, phone, soccerTeacher, soccerLockNa);
				} else if (menu2 == 3) {
					System.out.println("강사이름 입력");
					String swimTeacher = scn.next();
					System.out.println("등급");
					String swimGrade = scn.next();
					SwimMember mem3 = new SwimMember(memberId, memberName, phone, swimTeacher, swimGrade);

				} else {
					System.out.println("잘못 입력했습니다");

				}

			} else if (menu == 2) {// 수정
				System.out.println("수정할 회원 번호를 입력하세여 >> ");
				memberId = scn.nextInt();
				System.out.println("수정할 전화번호를 입력하세여 >> ");
				phone = scn.next();

				Member mem = new Member(memberId, null, phone);
				service.modifyMember(mem);
				System.out.println("고쳐줘따");

			} else if (menu == 3) {// 전체리스트 출력
				List<Member> memberList = service.memberList();
				for (Member m : memberList) {
					System.out.println(m.toString());
				}
			} else if (menu == 9) {// 종료
				System.out.println("프로그램 종료");
				break;

			} else {
				System.out.println("잘못입력햇씁니다");
			}

		}
	}
}
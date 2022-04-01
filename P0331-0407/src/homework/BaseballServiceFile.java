package homework;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseballServiceFile extends DAO implements BaseballService {

//	@Override
//	public void Login(String idetify, int password) {// 로그인
//		conn = getConnect();
//		String sql = "SELECT identify, pass\r\n" + "FROM login_info\r\n" + "WHERE identify = ?\r\n" + "AND pass = ? ";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, identify);
//			rs = psmt.executeQuery();
//			if (rs.next()) {
//				if (rs.getString(1).contentEquals(pass)) {
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

//	}

	@Override
	public void postAPost(Baseball baseball) {// 입력
		// *작성자, 입력날짜 자동기입넣기
		conn = getConnect();
		String sql = "INSERT INTO baseball_info \r\n"//
				+ "(post_name, post_nae)\r\n"//
				+ "VALUES (?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, baseball.getPostName());
			psmt.setString(2, baseball.getPostNae());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();
		}

	}

	@Override
	public Baseball getPostName(String name) {// 제목으로 조회
		conn = getConnect();
		String sql = "SELECT*\r\n" + "FROM baseball_info\r\n" + "WHERE post_name = ?";
		Baseball pno = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();
			if (rs.next()) {
				pno = new Baseball();
				pno.setPostName(rs.getString("post_name"));
				pno.setPostNae(rs.getString("post_nae"));
				pno.setPostPer(rs.getString("post_per"));
				pno.setPostPer(rs.getString("post_date"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return pno;
	}

	@Override
	public List<Baseball> baseballList() {// 전체목록조회
		List<Baseball> list = new ArrayList<Baseball>();
		conn = getConnect();
		String sql = "SELECT* \r\n" + "FROM baseball_info\r\n" + "ORDER BY post_no";
		try {
			psmt = conn.prepareStatement(sql);
			while (rs.next()) {
				Baseball baseball = new Baseball();
				baseball.setPostNo(rs.getInt("post_no"));
				baseball.setPostName(rs.getString("post_name"));
				baseball.setPostNae(rs.getString("post_nae"));
				baseball.setPostPer(rs.getString("post_per"));
				baseball.setPostDate(rs.getString("post_date"));
				list.add(baseball);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

//	@Override
//	public void modifyBaseballName(Baseball baseball) {// 게시글번호로수정(제목, 내용)
//		// *본인이 아닐때 수정불가하도록 기능 추가하기
//	
//		conn = getConnect();
//		String sql = "update baseball_info\r\r"//
//				+ "set baseball_name = ?,\r\n"//
//				+ "baseballnae = ?\r\n"//
//				+ "WHERE post_no = ? ";
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, baseball.getPostName());
//			psmt.setString(2, baseball.getPostNae());
//			psmt.setInt(3, baseball.getPostNo());
//
//			int r = psmt.executeUpdate();
//			System.out.println(r + "로 수정됨");
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			disconnect();
//
//		 
//
//	}

	@Override
	public void deleteBaseballName(String name) {// 게시글제목으로 삭제
		// *작성자 본인이 아닐 경우 삭제 불가하도록 기능 추가
		conn = getConnect();
		String sql = "DELETE FROM baseball_info\r\n"//
				+ "WHERE post_name = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}

	}

	@Override
	public void deleteBaseballPer(String per) {// 게시글 작성자로 삭제
		// *작성자 본인이 아닐 경우 삭제 불가하도록 기능 추가
		conn = getConnect();
		String sql = "DELETE FROM baseball_info\r\n"//
				+ "WHERE post_per = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, per);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void login(Login login) {// 로그인
		// *로그인 안될경우 될 경우 경우 만들어야함
		String sql = "INSERT INTO login_info\r\n" //
				+ "(identity,\r\n" + "pass,\r\n"//
				+ ")\r\n" + "VALUES(?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login.getIdentify());
			psmt.setString(2, login.getPass());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 접속됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void logout(Login login) {// 로그아웃 기능.
		// 로그아웃 후 종료 되도록 기능 추가 필요
		String sql = "INSERT INTO login_info\r\n" //
				+ "(pass,\r\n" + ")\r\n" //
				+ "VALUES(?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login.getPass());

			int r = psmt.executeUpdate();
			System.out.println(r + "로그아웃 됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void modifyBaseballName(Baseball baseball) {
		// TODO Auto-generated method stub
		
	}

}

package homework;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.collect.Student;

public class BaseballOracle extends DAO implements BaseballService {

	@Override
	public void login(Login login) {// 로그인
		conn = getConnect();
		String sql = "SELECT identify, pass\r\n"//
				+ "FROM login_info\r\n"//
				+ "WHERE identify = ?\r\n"//
				+ "AND pass = ? " + ")\r\n" + "VALUES(?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login.getIdentify());
			rs = psmt.executeQuery();

			int r = psmt.executeUpdate();
			if (rs.next()) {
				if (rs.getString(1).contentEquals(login.getPass())) {
					return 1;
					System.out.println(r + "건 접속됨");

				} else {
					return 0;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void postAPost(BaseballGall baseball) {// 입력
		conn = getConnect();

		String sql2 = "SELECT MAX(post_no)+1\r\n" + "FROM baseball_info";
		try {
			psmt = conn.prepareStatement(sql2);
			rs = psmt.executeQuery();
			if (rs.next()) {

				int nextNum = rs.getInt(1);

				String sql = "INSERT INTO baseball_info \r\n"//
						+ "(post_no, post_name, post_nae)\r\n"//
						+ "VALUES (?, ?, ?)";

				rs = psmt.executeQuery();
				if (rs.next()) {

					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, baseball.setPostNo(nextNum));
					psmt.setString(2, baseball.getPostName());
					psmt.setString(3, baseball.getPostNae());
					int r = psmt.executeUpdate();
					System.out.println(r + "건 입력됨");
				}

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();
		}

	}

	@Override
	public BaseballGall getPostNo(int postNo) {// 번호로 조회
		conn = getConnect();
		String sql = "SELECT*\r\n" + "FROM baseball_info\r\n"//
				+ "WHERE post_no = ?";
		BaseballGall pno = null;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, postNo);

			rs = psmt.executeQuery();
			if (rs.next()) {// 데이터가 들어있는 건수만큼 반복
				pno = new BaseballGall();
				pno.setPostNo(rs.getInt("post_no"));
				pno.setPostName(rs.getString("post_name"));
				pno.setPostNae(rs.getString("post_nae"));
				pno.setPostPer(rs.getString("post_per"));
				pno.setPostDate(rs.getString("post_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return pno;

	}

	@Override
	public List<BaseballGall> baseballList() {// 전체목록조회
		List<BaseballGall> list = new ArrayList<BaseballGall>();
		conn = getConnect();
		String sql = "SELECT* \r\n" + "FROM baseball_info\r\n"//
				+ "ORDER BY post_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BaseballGall baseball = new BaseballGall();
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

	@Override
	public void deleteBaseballPostNo(int postNo) {// 게시글번호로 삭제
		// *작성자 본인이 아닐 경우 삭제 불가하도록 기능 추가
		conn = getConnect();
		String sql = "DELETE FROM baseball_info\r\n"//
				+ "WHERE post_no = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, postNo);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}

	}

	

	@Override
	public void logout(Login login) {// 로그아웃 기능.
		String sql = "INSERT INTO login_info\r\n" //
				+ "(pass,\r\n" + ")\r\n" //
				+ "VALUES(?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login.getPass());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 로그아웃 됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void modifyBaseballName(BaseballGall baseball) {
		// 게시글번호로수정(제목, 내용)
		conn = getConnect();
		String sql = "UPDATE baseball_info\r\n"
				+ "SET post_name = ?,\r\n"
				+ "post_nae = ?\r\n"
				+ "WHERE post_no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, baseball.getPostName());
			psmt.setString(2, baseball.getPostNae());
			psmt.setInt(3, baseball.getPostNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();

		}

	}

	@Override
	public void addBaseBallMem(String identify, String pass) {
		
	}

	@Override
	public void deleteBaseballMem(String identify, String pass) {
		
	}
	
	

}

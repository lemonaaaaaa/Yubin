package homework;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseballServiceFile extends connection implements BaseballService {

	@Override
	public void Login(String idetify, int password) {// 로그인
		conn = getConnect();
		String sql = "SELECT identify, pass\r\n" + "FROM login_info\r\n" + "WHERE identify = ?\r\n" + "AND pass = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, identify);
			rs = psmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).contentEquals(pass)) {
					return 1;
				} else {
					return 0;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void Logout(int password) {// 로그아웃
		conn = getConnect();

	}

	@Override
	public void postAPost(Baseball baseball) {// 입력
		conn = getConnect();
		String sql = "insert into baseball_info (post_name, post_nae\r\n"
				+ "values (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, baseball.getPostName());
			psmt.setString(2, baseball.getPostNae());
		
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
			
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
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

	@Override
	public void modifyBaseballName(int postNo) {// 게시글번호로수정(제목, 내용)
		conn = getConnect();
		String sql = "update baseball_info\r\n"//
				+ "set post_name = ?,\r\n"//
				+ "post_nae = ?\r\n"//
				+ "WHERE post_no = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, baseball.getPostName());
			psmt.setString(2, baseball.getPostNae());
			psmt.setInt(3, baseball.getPostNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "로 수정됨");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void deleteBaseballName(String name) {// 게시글제목으로 삭제
		conn = getConnect();
		String sql = "DELETE\r\n"//
				+ "FROM baseball_info\r\n"//
				+ "WHERE post_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deleteBaseballPer(String per) {// 게시글 작성자로 삭제
		conn = getConnect();
		String sql = "DELETE\r\n"//
				+ "FROM baseball_info\r\n"//
				+ "WHERE post_per = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, per);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}

package homework;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseballServiceFile extends DAO implements BaseballService {

	@Override
	public void login(String identify, String pass) {
		conn = getConnect();
		String sql = "SELECT identify, pass\r\n" //
				+ "FROM login_info\r\n" + "WHERE identify = ?\r\n" //
				+ "AND pass = ? ";
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
			return -1; //로그인 정보가 없는경우

		} catch (SQLException e) {
			e.printStackTrace();
		}return -2; //DB에러

	}

	@Override
	public void logout(String identify, String pass) {
		String sql = "INSERT INTO login_info\r\n" //
				+ "(pass,\r\n" + ")\r\n" //
				+ "VALUES(?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Login.getPass());

			int r = psmt.executeUpdate();
			System.out.println(r + "로그아웃 됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void postAPost(BaseballGall baseball) {
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
	public BaseballGall getPostNo(int postNo) {
		return null;
	}

	@Override
	public List<BaseballGall> baseballList() {
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

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public void modifyBaseballName(BaseballGall baseball) {
		conn = getConnect();
		String sql = "update baseball_info\r\r"//
				+ "set baseball_name = ?,\r\n"//
				+ "baseball_nae = ?\r\n"//
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
	public void deleteBaseballPostNo(int postNo) {
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
	public void addBaseBallMem(String identify, String pass) {
		
	}

	@Override
	public void deleteBaseballMem(String identify, String pass) {
		
	}


	
}

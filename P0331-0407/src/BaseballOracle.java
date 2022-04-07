
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseballOracle extends DAO implements BaseballService {

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
	public void modifyBaseballName(BaseballGall baseball) {
		// 게시글번호로수정(제목, 내용)
		conn = getConnect();
		String sql = "UPDATE baseball_info SET post_name = ?,post_nae = ? " + "WHERE post_no = ?";

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
	public int findIdentify(String identify) {
		conn = getConnect();
		String sql = "SELECT identify\r\n" + "FROM login_info\r\n" + "WHERE identify = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, identify);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return 1;
			} else {
				return 0;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return 1;
	}

	@Override
	public boolean addBaseBallMem(String id, String pw) {
		conn = getConnect();
		String sql = "INSERT INTO login_info (identify, pass) " //
				+ "VALUES(?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	@Override
	public int deleteBaseballMem(String identify, String pass) {
		conn = getConnect();
		String sql = "DELETE\r\n" + "FROM login_info\r\n"//
				+ "WHERE identify = ?\r\n" + "AND\r\n" + "pass = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, identify);
			psmt.setString(2, pass);
			int r = psmt.executeUpdate();
			if(r == 0) {
				return 0;
			}
			System.out.println(r + "건 삭제됨");
			return 1;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}

	@Override
	public int login(String identify, String pass) {
		conn = getConnect();
		String sql = "SELECT identify, pass\r\n"//
				+ "FROM login_info\r\n"//
				+ "WHERE identify = ?\r\n"//
				+ "AND pass = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, identify);
			psmt.setString(2, pass);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return 1;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}

	@Override
	public void deleteBaseballPostNo(int postNo) {
		// 게시글번호로 삭제
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

}

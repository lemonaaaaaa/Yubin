package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.vo.MemberVO;

public class MemeberDAO extends DAO {

	public void insertMemeber(MemberVO member) {
		conn = getConnect();
		String Sql = "INSERT into members(id, name, passwd, email, profile) values(?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(Sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPasswd());
			psmt.setString(4, member.getEmail());
			psmt.setString(5, member.getProfile());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public MemberVO searchMemeber(String id) {
		conn = getConnect();
		String sql = "SELECT * FROM members WHERE id=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setPasswd(rs.getString("passwd"));
				return vo;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;

	}

	public void updateMemeber(MemberVO vo) {
		conn = getConnect();
		String Sql = "UPDATE members SET name = ? , passwd=?, email=? WHERE id = ?";

		try {
			psmt = conn.prepareStatement(Sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getId());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}

	}

	public void deleteMemeber(String id) {
		conn = getConnect();
		String sql = "DELETE FROM members WHERE id=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public List<MemberVO> listMemeber() {
		conn = getConnect();
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			psmt = conn.prepareStatement("SELECT * FROM members ORDER BY id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("Name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setProfile(rs.getString("Profile"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
		
		
		

	}

}

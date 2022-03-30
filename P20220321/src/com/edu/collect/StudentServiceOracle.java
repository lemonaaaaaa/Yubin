package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {// 정보입력
		conn = getConnect();
		String sql = "insert into studnet_info (student_no, student_name, eng_score, kor_score)\r\n"
				+ "values (?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudentNo());
			psmt.setString(2, student.getStudentNa());
			psmt.setInt(3, student.getStudentEn());
			psmt.setInt(4, student.getStudentKo());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public Student getStudent(int sno) {// 번호로 조회
		conn = getConnect();
		String sql = "select * from student_info\r\n"//
				+ "WHERE student_no = ? ";
		Student stu = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);

			rs = psmt.executeQuery();
			if (rs.next()) {// 데이터가 들어있는 건수만큼 반복
				stu = new Student();
				stu.setStudentNo(rs.getInt("student_no"));
				stu.setStudentNa(rs.getString("student_name"));
				stu.setStudentEn(rs.getInt("eng_score"));
				stu.setStudentKo(rs.getInt("kor_score"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
		return stu;

	}

	@Override
	public List<Student> studentList() {// 전체리스트조회
		List<Student> list = new ArrayList<Student>();// 조회된 결과값을 담기 우ㅣ한 컬렉션
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);// NEW STUDENT()이거는 생성자. 프리페어는 쿼리넣어서 실행
			rs = psmt.executeQuery();// 실행건수만큼 반복하겟다.
			while (rs.next()) {// 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 가지고오겟다
				Student student = new Student();
				student.setStudentNo(rs.getInt("student_no"));
				student.setStudentNa(rs.getString("student_name"));
				student.setStudentEn(rs.getInt("eng_score"));
				student.setStudentKo(rs.getInt("kor_score"));
				list.add(student);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {// 국어 영어 점수 수정.
		conn = getConnect();
		String sql = "update student_info\r\r"//
				+ "set eng_score = ?,\r\n"//
				+ "kor_score = ?\r\n"//
				+ "WHERE student_no = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudentEn());
			psmt.setInt(2, student.getStudentKo());
			psmt.setInt(3, student.getStudentNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "로 수정이 됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}
	}

	@Override
	public void removeStudent(String sna) {// dlfma 받아 정보삭제
		conn = getConnect();
		String sql = "DELETE FROM student_info\r\n"//
				+ "WHERE student_name = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sna);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();

		}

	}

	@Override
	public List<Student> searchStudent(String name) {// 이름으로 조회
		List<Student> students = new ArrayList<Student>();

		conn = getConnect();
		String sql = "select * from student_info\r\n"//
				+ "WHERE student_name = ? ";
		Student stu = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();

			while (rs.next()) {// 데이터가 들어있는 건수만큼 반복
				stu = new Student();
				stu.setStudentNo(rs.getInt("student_no"));
				stu.setStudentNa(rs.getString("student_name"));
				stu.setStudentEn(rs.getInt("eng_score"));
				stu.setStudentKo(rs.getInt("kor_score"));
				students.add(stu);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {// 정상실행, 에러발생 상관없이 반드시 실행되는 코드
			disconnect();
		}
		return students;
	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub

	}

}

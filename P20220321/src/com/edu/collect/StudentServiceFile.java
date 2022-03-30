package com.edu.collect;

import java.io.*;
import java.util.*;

//studentServiceImpl 중첩클래스의 기능 대체
// 입력, 수정 , 삭제 -> 파일에 저장되로록
public class StudentServiceFile implements StudentService {

	// 기본 생성자에 파일이 저장되어 있는 파일 정보를 읽어서 arrayList에 생성자에
	// list 값을 담아줄 것
//	public  StudentServiceFile() {ㄴ
//		//필드
//		List<Student>list = new ArrayList<Student>();
//		File file;
//		
	// 생성자
	// 기본생성자에 파일에 저장되어 있는 정보를 읽어서 ~~
	
		try {
			FileReader fr = new FileReader("student.data");
			BufferedReader br = new BufferedReader(fr);

			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); // ,를 기준으로 값 하나씩 분리
//				contents[0] <= 101, contents[1]<=김지찬, contensts[2] <=80, contents[3]<=
				list.add(new Student(Integer.parseInt(contents[0]), //
						contents[1], //
						Integer.parseInt(contents[2]), //
						Integer.parseInt(contents[3])//
				));

			}
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	List<Student> list = new ArrayList<Student>();
	File file;

	@Override
	public void insertStudent(Student student) {
		list.add(student);

	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNo() == sno) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Student> studentList() {
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getStudentNo() == student.getStudentNo()) {
				list.get(i).setStudentEn(student.getStudentEn());// 영어점수를 수정
				list.get(i).setStudentKo(student.getStudentKo());// 국어점수를 수정

			}
		}
	}

	@Override
	public void removeStudent(int srn) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNo() == srn) {
				list.remove(i);
			}
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNa().equals(name)) {
				searchList.add(list.get(i));

			}
		}
		return searchList;
	}

	@Override
	public void saveToFile() {
		try {
			FileWriter fw = new FileWriter("student.data");
			BufferedWriter bw = new BufferedWriter(fw);

			for (Student student : list) {
				bw.write(student.getStudentNo() + "," + student.getStudentNa() + ","//
						+ student.getStudentEn() + "," + student.getStudentKo() + "\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

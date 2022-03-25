package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService {

	List<Student> list = new ArrayList<Student>();
	File file;

	@Override
	public void insertStudent(Student student) {

	}

	@Override
	public Student getStudent(int sno) {
		return null;
	}

	@Override
	public List<Student> studentList() {
		return null;
	}

	@Override
	public void modifyStudent(Student student) {

	}

	@Override
	public void studentdelete(int sno) {

	}

	@Override
	public List<Student> searchStudent(String name) {
		return null;
	}

	@Override
	public void saveToFile() {

	}

}

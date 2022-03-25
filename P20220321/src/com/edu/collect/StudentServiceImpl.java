package com.edu.collect;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public void insertStudent(Student student) {
		
	}


	@Override
	public void saveToFile() {
		try {
			FileWirter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferWriter(fw);
			
			for(Student stud : list) {
				bw.write(stud.getStudentNo() +", " + stud.getStudentNa()//
				+bw.write(stud.getStudentKo() + ", " + stud.getStudentEn());
			}
		}
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
		
		return;
	}


	@Override
	public void studentdelete(int sno) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Student> searchStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	


	
	

}

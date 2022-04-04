package com.test;

public class HighStudent extends Student{
	private String teacherName; // 담임선생님.
	private String groupName; // 반이름.
	
	public HighStudent(String studNo, String studName, String teacherName, String groupName) {
		super(studNo, studName);
		this.teacherName = teacherName;
		this.groupName = groupName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "HighStudent [ 학생이름 = " + super.getStudName() + " 학생번호 = " + super.getStudNo() //
		+  " 담당교사 =" + teacherName + ", 반 이름 =" + groupName + "]";
	}

	
	
	
	
	
}

package com.edu.Io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//입려ㅑㄱ한값을 계쏙 파일에 저장
public class studentFileExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {
//		writeStudent();
		readStudent(); 
		// 텍스트 101 홍준표 30 50 값을 가져와서
		//-> new Student(101, 홍준표, 30 ,50)이 값으로 인스턴스 생성

		for (Student student : list)
			System.out.println(student.toString());
		System.out.println("==========end============");
	}// end of main

	// 읽어들이는 메소드.
	public static void readStudent() {
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			String readStr = null;

			while ((readStr = br.readLine()) != null) {
				String[] contents = readStr.split(" "); // 101 홍준표 20 30 을 문자열 배열에 담음
				list.add(new Student(Integer.parseInt(contents[0])// 문자열을 intfh
						, contents[1] //
						, Integer.parseInt(contents[2])//
						, Integer.parseInt(contents[3])));//
//				System.out.println(readStr);
			}

			br.readLine();
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while (true) {
				System.out.println("이름 입력 >> 101 홍준표 20 30");
				String name = scn.nextLine();// 한 라인 전체를 읽음
				if (name.equals("STOP")) {
					break;
				}
				bw.write(name + " \n");
			}

			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

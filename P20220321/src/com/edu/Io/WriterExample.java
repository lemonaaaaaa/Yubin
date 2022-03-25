package com.edu.Io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		// 출력스트링믈 문자기반으로 second.txt
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hell로\n");
			fw.write("월드\n");
			fw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("============");

	}
}

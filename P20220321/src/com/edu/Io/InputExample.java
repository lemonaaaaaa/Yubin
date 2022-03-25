package com.edu.Io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {
		try {//입력스트림 생성. first.dat 파일을 입력스트림의 소스
			InputStream is = new FileInputStream("first.dat");
			
			int readByte = 0;
			
			while((readByte = is.read()) != -1) {//리드바이트를 이즈 ㄹ리드에 담아줌
			
			System.out.println(readByte);
			is.close();
		}} catch (IOException e) {
			e.printStackTrace();
		}

	

}
	}


package com.edu.Io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/image.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = //
					new BufferedOutputStream(new FileOutputStream("c:/temp/copy3.jpg"));

			int readByte = -1;
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);

			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("=====================");

	}//인풋스트림 아웃풋스트림으로 파일 복사하는것. 그냥 복붙하면안되나? 에바쎄바
}

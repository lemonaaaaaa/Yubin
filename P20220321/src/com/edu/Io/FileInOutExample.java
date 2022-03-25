package com.edu.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
	public static void main(String[] args) throws IOException {
		try {

			FileInputStream fis = new FileInputStream("c:/temp/image.jpg");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.jpg");

			int readByte = -1;
			byte[] readBytes = new byte[100];
			// 바이트 배열 선언으로 한번에 100바이트씩 읽게함

			while ((readByte = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByte);//70byte ->

			}
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("=======댐");

	}
}

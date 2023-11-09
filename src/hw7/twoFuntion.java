package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class twoFuntion {

	public static void main(String[] args) {

		String fileOne = "C:/javawork/hello.txt";
		String fileTwo = "C:/javawork/hellocopy.txt";
		copyFile(fileOne, fileTwo);
		System.out.println("複製成功");
	}

	public static void copyFile(String fileOne, String fileTwo) {
		try (
				FileInputStream fis = new FileInputStream(fileOne);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(fileTwo);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			int bRead;
			while ((bRead = bis.read()) != -1) {
				bos.write(bRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

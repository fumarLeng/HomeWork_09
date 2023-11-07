package hw7;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HomeWork_Data {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:/javawork/Data.txt");
		BufferedOutputStream bf = new BufferedOutputStream(file);
		OutputStreamWriter ow = new OutputStreamWriter(bf);
		for(int i = 0 ;i<=10;i++) {
			int x = (int)(Math.random()*1000);
			String data = String.valueOf(x);
			ow.append(data);
			ow.append("\n");
			ow.flush();
			System.out.println(x);
		}
	}

}

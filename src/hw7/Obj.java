package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Obj {

	public static void main(String[] args) throws IOException {
		Dog dog = new Dog("Bob");
		Dog dog1 = new Dog("Bob1");
		Cat cat = new Cat("Sara");
		Cat cat1 = new Cat("Sara1");

		File dataF = new File("C:/javawork/data");
		if (!dataF.exists()) {
			dataF.mkdirs();
		}
		File objFile = new File("C:/javawork/data/Object.ser");
		FileOutputStream fos = new FileOutputStream(objFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(dog);
		System.out.println("dog寫入成功");
		oos.writeObject(dog1);
		System.out.println("dog1寫入成功");
		
		oos.writeObject(cat);
		System.out.println("cat寫入成功");
		oos.writeObject(cat1);
		System.out.println("cat1寫入成功");

		oos.close();
		fos.close();
	}
}

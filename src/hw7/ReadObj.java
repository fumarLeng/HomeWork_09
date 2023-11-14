package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadObj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File objFile = new File("C:/javawork/data/Object.ser");
		FileInputStream fis = new FileInputStream(objFile);
		ObjectInputStream ois = new ObjectInputStream(fis);

		
		ArrayList<Animal> animals = new ArrayList<>();
		while (true) {
			try {
				Object obj = ois.readObject();
				if (obj instanceof Animal) {
					animals.add((Animal) obj);
				}
			} catch (ClassNotFoundException | IOException e) {
				break;
			}
		}

		for (Animal animal : animals) {
			animal.speak();
		}
		ois.close();
		fis.close();
	}
}

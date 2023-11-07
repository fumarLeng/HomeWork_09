package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork_1 {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("C:/javawork/Sample.txt");
//		BufferedWriter bf = new BufferedWriter(fw);
//		PrintWriter pw = new PrintWriter(bf);
//
//		pw.write("Java是一種電腦程式設計語言,擁有跨平台、物件導向、泛型程式設計的特性,廣泛應用於企業級Web應用開發和行動應用開發。\r\n"
//				+ "任職於昇陽電腦的詹姆斯·高斯林等人於1990年代初開發Java語言的雛形,最初被命名為Oak,目標設定在家用電器等小型系統的程\r\n"
//				+ "式語言,應用在電視機、電話、鬧鐘、烤麵包機等家用電器的控制和通訊。由於這些智慧型家電的市場需求沒有預期的高,Sun公\r\n"
//				+ "司放棄了該項計劃。隨著1990年代網際網路的發展,Sun公司看見Oak在網際網路上應用的前景,於是改造了Oak,於1995年5月\r\n"
//				+ "以Java的名稱正式釋出。Java伴隨著網際網路的迅猛發展而發展,逐漸成為重要的網路程式語言。\r\n"
//				+ "Java程式語言的風格十分接近C++語言。繼承了C++語言物件導向技術的核心,Java捨棄了C++語言中容易引起錯誤的指標,改以\r\n"
//				+ "參照取代,同時移除原C++與原來運算子多载,也移除多重繼承特性,改用介面取代,增加垃圾回收器功能。在Java SE 1.5版本中\r\n"
//				+ "引入了泛型程式設計、類型安全的列舉、不定長參數和自動裝/拆箱特性。昇陽電腦對Java語言的解釋是:「Java程式語言是個簡單、\r\n"
//				+ "物件導向、分布式、解釋性、健壯、安全與系統無關、可移植、高效能、多執行緒和動態的語言」");
//		pw.close();
//		bf.close();
//		fw.close();
		File fi = new File("C:/javawork/Sample.txt");
		FileReader fw = new FileReader("C:/javawork/Sample.txt");
		BufferedReader read = new BufferedReader(fw);
		String line;
		int cCount = 0;
		int lCount = 0;

		while ((line = read.readLine()) != null) {
			cCount = cCount + line.length();
			lCount++;
		}
		System.out.println("檔案大小為:" + fi.length() + "\n字元數為" + cCount + "\n行數為" + lCount);
	}

}

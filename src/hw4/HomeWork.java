package hw4;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
//		int[] i = new int[] { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int sum = 0;
//		int count = i.length;
//		for (int a = 0; a < count; a++) {
//			sum = sum + i[a];
//		}
//		int avg = sum / count;
//		System.out.println("陣列的平均值為: " + avg);
//		System.out.println("大於平均值的數字有: ");
//		for (int a = 0; a < count; a++) {
//			if (i[a] > avg) {
//				System.out.print(i[a] + " ");
//			}
//		}

//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)

//		String s = "Hello World";
//		StringBuffer str = new StringBuffer(s);
//		System.out.println(str.reverse());

//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
// 
//		String[] i = { "mercury", "venus" , "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		
//		int count = 0;
//		for (int x = 0; x < i.length ; x++) {
//
//			for (int j = 0; j < i[x].length(); j++) {
//				int x1 = i[x].charAt(j);				
//				if(x1 == 'a' || x1 == 'e' || x1 == 'i'|| x1 == 'o' || x1 == 'u' ) {
//					count++;
//					
//				}
//				
//				
//				
//				
//			}
//		}
//		System.out.println("八大行星裡面出現aeiou的次數為: " + count);

//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」

//		int[][] price = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
//		System.out.println("請輸入金額");
//		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		int count = 0;
//		System.out.println("有錢可借的員工編號: ");
//		for (int i = 0; i < price.length; i++) {
//			int cashManId = price[i][0];
//			int UseMan = price[i][1];
//			if (UseMan > money) {
//				System.out.print(cashManId + " ");
//				count++;
//			}
//
//		}
//		System.out.println();
//		System.out.println(" 共 " + count + " 人");

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

//				公元年份非4的倍數，為365天平年。
//				公元年份為4的倍數但非100的倍數，為366天閏年。
//				公元年份為100的倍數但非400的倍數，（ 1700年 、 1800年 及 1900年 ）為平年。
//				公元年份為400的倍數，（ 1600年 及 2000年 ）為閏年。

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("請輸入西元年份");
//		int year = sc.nextInt();
//		System.out.println("請輸入月份");
//		int month = sc.nextInt();
//		System.out.println("請輸入日期");
//		int day = sc.nextInt();
//
//		Date date = new Date(year, month, day);
//		int dayOfyear = date.DayOfYear();
//		System.out.println("輸入的日期為該年第" + dayOfyear + "天");

//		班上有8位同學,他們進行了6次考試結果如下:
//
//			請算出每位同學考最高分的次數
//			(提示:二維陣列)

		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// scores.length; //考試六次
		// scores[0].length //學生八位

		int[] maxScoresCount = new int[scores.length]; // 用於儲存每位同學的最高分次數

		for (int student = 0; student < scores.length; student++) {
			int[] studentScores = scores[student];
			int count = 0; // 初始化次數為 0
			for (int exam = 0; exam < studentScores.length; exam++) {
				int studentScore = studentScores[exam];
				boolean isHighest = true; // 假設此次考試成績是最高的
				for (int otherStudent = 0; otherStudent < scores.length; otherStudent++) {
					if (otherStudent != student) {
						// 檢查其他同學的分數比該同學高
						if (scores[otherStudent][exam] >= studentScore) {
							isHighest = false;
							break;
						}
					}
				}
				if (isHighest) {
					count++; // 如果同學的分數是最高的，增加次數
				}
			}
			maxScoresCount[student] = count; // 儲存最高分次數
		}

		// 輸出每位同學的最高分次數
		for (int student = 0; student < maxScoresCount.length; student++) {
			System.out.println("學生 " + (student + 1) + " 的最高分次數: " + maxScoresCount[student]);
		}

	}
}

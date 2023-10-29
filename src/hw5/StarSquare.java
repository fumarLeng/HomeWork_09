package hw5;

import java.util.Scanner;

public class StarSquare {

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長:");
		int height = sc.nextInt();
		System.out.println("請輸入寬");
		int widght = sc.nextInt();
		starSquare(widght,height);
		

	}
	
	public static void starSquare(int width,int height) {
		for(int i = 0;i<height;i++) {
			for(int j = 0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}

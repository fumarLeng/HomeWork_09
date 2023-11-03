package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入x");
			int x = sc.nextInt();
			System.out.println("請輸入y");
			int y = sc.nextInt();

			Calculator cal = new Calculator();
			int result;
			result = cal.calxy(x, y);
			System.out.println("x的y平方結果是" + result);

		} catch (CalException e) {
			System.out.println("錯誤" + e.getMessage());
		} catch (Exception e) {
			System.out.println("異常" + e.getMessage());
		}
	}
}

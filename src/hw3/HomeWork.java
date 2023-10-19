package hw3;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入進入的題目");
		System.out.println("1.判斷三角形");
		System.out.println("2.猜數字1~9");
		System.out.println("3.大樂透");
		int x = sc.nextInt();

		switch (x) {
		case 1: {
			area();
			break;
		}
		case 2: {
			Numbers();
			break;
		}
		case 3: {
			OneToNine();
			break;
		}

		}

	}

	public static void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入第一個數字");
		int a = sc.nextInt();
		System.out.println("請輸入第二個數字");
		int b = sc.nextInt();
		System.out.println("請輸入第三個數字");
		int c = sc.nextInt();

		if (a + b > c || a + c > b || b + c > a) {
			if (a == b && a == c && b == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || c == a) {
				System.out.println("等腰三角形");
			} else if ((a * a + b * b) == c * c || (b * b + c * c) == a * a || (c * c + a * a) == b * b) {
				System.out.println("直角三角形");
			} else {
				if (a != b || b != c || c != a) {
					System.out.println("其他三角形");
				} else {
					System.out.println("不是三角形");
				}
			}

		}
	}

	public static void Numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字 1~9");
		while (true) {
			int a = (int) (Math.random() * 10);
			int i = sc.nextInt();
			if (i != a) {
				System.out.println("猜錯囉");
				continue;
			} else {
				System.out.println("答對了,答案就是" + a);
			}
			break;
		}
	}

	public static void OneToNine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入1~9的數字");
		int a = sc.nextInt();
		int i = 1;
		int count = 0;

		for (i = 1; i <= 49; i++) {
			int zero = i % 10;
			int ten = i / 10;
			if (zero != a && ten != a) {
				System.out.print(i + "\t");
				count++;
				if (count % 6 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println("總共有" + count + "個");
	}

}

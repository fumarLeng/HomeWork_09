package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		System.out.println("• 請建立一個TestNineNine.java程式，可輸出九九乘法表");
		System.out.println();
		ForWhile();
		ForDoWhile();
		WhileDoWhile();

	}

	public static void ForWhile() {
		System.out.println();
		System.out.println("• 一：使用for迴圈 + while迴圈");
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
	}

	public static void ForDoWhile() {
		System.out.println();
		System.out.println("• 二：使用for迴圈 + do while迴圈");
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			{
				System.out.println();
			}
		}

	}

	public static void WhileDoWhile() {
		System.out.println();
		System.out.println("• 三：使用while迴圈 + do while迴圈");
		System.out.println();
		int i = 1;
		
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			{
				System.out.println();
			}
			i++;
		}
	}
}

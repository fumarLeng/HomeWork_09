package hw5;

public class RandAvg {

	public static void main(String[] args) {
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		randAvg();
	}

	public static void randAvg() {
		int x = 0;
		int rd[] = new int[10];
		System.out.println("10個亂數為");
		for (int i = 0; i < rd.length; i++) {
			rd[i] = (int) (Math.random() * 101);
			System.out.print(rd[i] + " ");
			x += rd[i];
		}
		System.out.println();
		int avg = x / rd.length;
		System.out.println("平均數為" + "\n" + avg);
		

	}

}

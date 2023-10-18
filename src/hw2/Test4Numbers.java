package hw2;

public class Test4Numbers {

	public static void main(String[] args) {

//		請建立一個Test4Numbers.java，可輸出0～100裡4的倍數
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0 && i != 0) {
				System.out.println(i);
			}
		}

	}

}

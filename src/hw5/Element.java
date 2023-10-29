package hw5;

public class Element {

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Element ee = new Element();
		System.out.println("第一陣列最大值為: " + ee.maxElement(intArray));
		System.out.println("第二陣列最大值為: " + ee.maxElement(doubleArray));

	}

	public int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}

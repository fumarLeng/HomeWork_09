package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle my = new MyRectangle();
		my.setWidth(4);
		my.setDepth(5);
		double area1 = my.getArea();
		System.out.println("第一個面積為 "  + area1);
		MyRectangle my1 = new MyRectangle(4.6,5.5);
		double area2 = my1.getArea();
		System.out.println("第二個面積為 " + area2);
	}

}

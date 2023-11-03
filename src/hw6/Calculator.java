package hw6;

public class Calculator {

	public int calxy(int x,int y)throws CalException {
		if(x ==0 && y ==0) {
			throw new CalException("x,y都是零");
		}else if(y <0) {
			throw new CalException("y是負數,結果不是整數");
		}else if(x == 0 || y ==0) {
			System.out.println("0的數字或次方沒有意義");
		}
		return (int)Math.pow(x, y);
		
	}
}

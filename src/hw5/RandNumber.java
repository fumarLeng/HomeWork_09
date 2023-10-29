package hw5;

public class RandNumber {

	public static void main(String[] args) {
		String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int x = (int)(Math.random()*str.length()+1);
		System.out.println(str.toString());
		System.out.println(x);
		
	}

	public void getAuthCode() {
		
		
	}
}

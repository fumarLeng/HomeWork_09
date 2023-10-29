package hw5;

public class RandNumber {

	public static void main(String[] args) {
        String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        int codeLength = 8; 
        StringBuffer authCode = new StringBuffer();

        for (int i = 0; i < codeLength; i++) {
            int charBox = (int) (Math.random()*str.length());
            char randomChar = str.charAt(charBox);
            authCode.append(randomChar);
        }

        String code = authCode.toString();
        System.out.println("驗證碼為: " + code);
    }
}

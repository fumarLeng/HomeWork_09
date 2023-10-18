package hw1;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		• 請設計一隻Java程式,計算12,6這兩個數值的和與積

//		int x = 12;
//		int y = 6;
//		System.out.println("和:" + (x+y));
//		System.out.println("積:" + (x*y));

//=================================================================================

//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

//		int x = 200;
//		System.out.println("200顆雞蛋為:" + (x/12) + "打" + (x%12) + "顆");

//=================================================================================

//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

//		int totals = 256559;
//		int OneD = (60 * 60 * 24); //86400
//		int OneH = (60 * 60);
//		int OneM = 60;
//
//		System.out.print(totals/OneD + "天");
//		System.out.print(totals%OneD/OneH + "小時");
//		System.out.print(totals%OneD%OneH/60 + "分" );
//		System.out.print(totals%OneD%OneH%OneM + "秒" );

//=================================================================================

//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

//		final double PI = 3.1415;
//		double x = 5;
//		System.out.println("園面積=" + x*x*PI);
//		System.out.println("圓周長=" + x*2*PI);

//========================================================================================

//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)

//		本金 ×（1＋年利率）^期間

//		double money = 1500000;
//		double rate = 0.02;
//		double time = 10;
//
//		for (time = 1; time <= 10; time++) {
//			money *= (1 + rate);
//		}
//		System.out.println((int) money);

////		double x = money * Math.pow((1 + rate), time);
////		System.out.println((int) x);

//================================================================================

//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因

//		System.out.println(5+5);
//        整數加整數所以為整數10
//		System.out.println(5+'5');
//		  '5'等於字元5  ASCII碼是53  所以等於5+53=58
//		System.out.println(5+"5");
//		  "5"等於字串 整數加字串會轉成字串 所以是55
		System.out.println("=======");
		System.out.println("=======");
	}

}

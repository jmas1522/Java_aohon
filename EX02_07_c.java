//2桁の正の整数値(10以上99以下の値)をランダムに生成して表示するプログラム

import java.util.Random;

class EX02_07_c {
	
		public static void main(String[] args){
			Random rand = new Random();
			
			int a = rand.nextInt(90)+10;
			System.out.println("二桁の正の整数値："+a);
	}
}

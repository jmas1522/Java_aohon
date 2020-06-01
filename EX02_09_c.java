//-1.0以上1.0未満の実数値をランダムに生成するプログラム

import java.util.Random;

class EX02_09_c {

	public static void main(String[] args){
		Random rand = new Random();
		
		double a = rand.nextDouble();
		int b = rand.nextInt(2);
		
		System.out.println("－1.0以上1.0未満の実数値："+(a - b));
	}
}
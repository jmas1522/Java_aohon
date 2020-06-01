//0.0以上10.0未満の実数値をランダムに生成するプログラム

import java.util.Random;

class EX02_09_b {

		public static void main(String[] args){
			Random rand=new Random();
			
			double a=rand.nextDouble()*10;
			System.out.println("0.0以上10.0未満の実数値："+a);
	}
}
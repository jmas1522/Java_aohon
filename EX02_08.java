//読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラム

import java.util.Random;
import java.util.Scanner;

class EX02_08 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		int b = rand.nextInt(11) - 5;
		System.out.println("その値の±5の乱数を生成しました。それは"+(a + b)+"です。");
	}
}

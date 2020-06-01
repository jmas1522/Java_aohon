//読み込んだ正の整数値の桁数を出力するプログラム

import java.util.Scanner;

class EX04_08 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		int x = n;
		int count = 0;
		
		do{
			x /= 10;
			count++;
		}while (x > 0);
		
		System.out.print("その値は" + count+ "桁です。");
	}
}

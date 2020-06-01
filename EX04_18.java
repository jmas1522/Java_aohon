//1からnまでの整数値の2乗値を表示するプログラム

import java.util.Scanner;

class EX04_18 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("nの値：");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++)
			System.out.println(i+"の2乗値は"+ (i*i));
	}
}

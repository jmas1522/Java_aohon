//10進数を読み込んで、その値を8進数と16進数で表示するプログラム

import java.util.Scanner;

class EX05_01 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		System.out.printf("8進数では%oです。",a);
		System.out.printf("16進数では%xです。",a);
	}
}

package aohon07;
//1からnまでの全整数の和を求めて返却するメソッド

import java.util.Scanner;

public class EX07_04 {

	private static int sumUp(int n) {
		int sum = 0;
		
		for (int i = 0; i <= n; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

	System.out.println("1からnまでの和を求めます。");
	System.out.print("整数n：");	int n = stdIn.nextInt();
	
	System.out.println("1からnまでの和は" + sumUp(n) +"です。");
	}
}

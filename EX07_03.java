package aohon07;
//三つの整数値の中央値を求めるメソッド

import java.util.Scanner;

public class EX07_03 {

	static int med(int a, int b, int c) {
		int min = a;
		int med = a;
		int max = a;
		
		if (b < min) {
			min = b;
		}else if(b > max){
			max = b;
		}
		
		if (c < min) {
			min = c;
		}else if(c > max){
			max = c;
		}
		
		if(b != min && b != max)	med = b;
		if(c != min && c != max)	med = c;
		return med;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");	int a = stdIn.nextInt();
		System.out.print("整数b：");	int b = stdIn.nextInt();
		System.out.print("整数c：");	int c = stdIn.nextInt();
		
		System.out.println("中央値は" + med (a,b,c) +"です。");
	}
}


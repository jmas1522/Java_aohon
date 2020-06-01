//読み込んだ三つの整数値の中央値を表示するプログラム

import java.util.Scanner;

class EX03_13 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A:");	int a = stdIn.nextInt();
		System.out.print("整数値B:");	int b = stdIn.nextInt();
		System.out.print("整数値C:");	int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) {
		   max = b;
		}
		
		if(c > max) {
		   max = c;
		}
		
		
		int min = b;
		if(a < min) {
		   min = a;
		}
		
		if(c < min) {
		   min = c;
		}
		
		
		int mid = c;
		if(a != max && a != min){
		   mid = a;
		}
		
		if(b != max && b != min){
		   mid = b;
		}
		
		System.out.println("中央値は" + mid + "です。");
	}
}
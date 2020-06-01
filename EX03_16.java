//読み込んだ三つの整数値を、昇順（小さい順）にソートして表示するプログラム

import java.util.Scanner;

class EX03_16 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a:");	int a = stdIn.nextInt();
		System.out.print("整数値b:");	int b = stdIn.nextInt();
		System.out.print("整数値c:");	int c = stdIn.nextInt();
		
		int max = a;
		int mid = b;
		int min = c;
		
		if(max < mid) {
			int t = max;
			max = mid;
			mid = t;
		}
		
		if(mid < min) {
			int t = mid;
			mid = min;
			min = t;
		}
		
		if(max < mid) {
			int t = max;
			max = mid;
			mid = t;
		}
		System.out.println("a≦b≦cとなるようにソートしました。");
		System.out.println("変数値aは" + min + "です。");
		System.out.println("変数値bは" + mid + "です。");
		System.out.println("変数値bは" + max + "です。");
	}
}
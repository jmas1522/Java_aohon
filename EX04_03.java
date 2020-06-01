//二つの変数を読み込んで、小さいほうの数以上で大きいほうの数以下の全数値を小さいほうから順に表示するプログラム

import java.util.Scanner;

class EX04_03 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:");	int a = stdIn.nextInt();
		System.out.print("整数B:");	int b = stdIn.nextInt();
		
		int max = a;
		int min = b;
		
		if (max < min){
			int t = max;
			max =min;
			min =t;
		}
		
		int n = min;
		
		do {
			System.out.print(n);
			n = n + 1;
			System.out.print(" ");
		} while (max != n);
		
		System.out.println(n);
	}
}
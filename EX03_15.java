//二つの変数を降順（大きい順）にソートして表示するプログラム

import java.util.Scanner;

class EX03_15 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数a:");
			int a = stdIn.nextInt();
			System.out.print("整数b:");
			int b = stdIn.nextInt();
			
			if(a < b) {
				int t = a;
					a = b;
					b = t;
			}
			System.out.println("a≧bとなるようにソートしました。");
			System.out.println("変数aは" + a + "です。");
			System.out.println("変数bは" + b + "です。");
		}
	}
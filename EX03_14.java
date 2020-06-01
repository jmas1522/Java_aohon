//二つの整数値の小さいほうの値と大きいほうの値を求めて表示するプログラム

import java.util.Scanner;

class EX03_14 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数a:");
			int a = stdIn.nextInt();
			System.out.print("整数b:");
			int b = stdIn.nextInt();
			
			if(a == b)
				System.out.println("二つの値は同じです。");
			
			else {
				int min, max;
				if(a < b) {
					min = a;
					max = b;
				} else {
					min = b;
					max = a;
				}
				
				System.out.println("大きいほうの値は" + max + "です。");
				System.out.println("小さいほうの値は" + min + "です。");
			}
	}
}
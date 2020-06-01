//読み込んだ三つの整数値の最小値を表示するプログラム

import java.util.Scanner;

class EX03_12 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数値:");
			int a = stdIn.nextInt();
			System.out.print("整数値:");
			int b = stdIn.nextInt();
			System.out.print("整数値:");
			int c = stdIn.nextInt();
			
			int min = a;
			if(b < min) min = b;
			if(c < min) min = c;
			
			System.out.println("最小値は" + min + "です。");
	}
}
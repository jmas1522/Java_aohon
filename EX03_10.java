//読み込んだ二つの整数値の差を表示するプログラム

import java.util.Scanner;

class EX03_10 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数値:");
			int a = stdIn.nextInt();
			System.out.print("整数値:");
			int b = stdIn.nextInt();
			
			int sa;
			if(a >= b)
				sa = a - b;
			else
				sa = b - a;
			
			System.out.println("それらの差は" + sa + "です。");
	}
}
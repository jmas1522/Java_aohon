//読み込んだ二つの整数値の大きいほうの値を表示するプログラム

import java.util.Scanner;

class EX03_09 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数値:");
			int a = stdIn.nextInt();
			System.out.print("整数値:");
			int b = stdIn.nextInt();
			
			int max;
			if(a < b)
				max = b;
			else
				max = a;
			
			System.out.println("大きいほうの値は" + max + "です。");
	}
}
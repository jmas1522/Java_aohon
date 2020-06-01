//読み込んだ二つの整数値の差が10以下かどうかを表示するプログラム

import java.util.Scanner;

class EX03_11 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("整数A:");
			int a = stdIn.nextInt();
			System.out.print("整数B:");
			int b = stdIn.nextInt();
			
			int sa = a >= b ? a - b :  b - a;
			
			if(sa <= 10)
				System.out.println("それらの差は10以下です。");
			else
				System.out.println("それらの差は11以上です。");
			
	}
}
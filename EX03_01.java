//読み込んだ整数値の絶対値を表示するプログラム

import java.util.Scanner;

class EX03_01 {
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("整数値：");
			int a=stdIn.nextInt();
		
			if (a >= 0)
				System.out.println("その絶対値は"+a+"です。");
			else
				System.out.println("その絶対値は"+(-a)+"です。");
		}
}
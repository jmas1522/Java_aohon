//読み込んだ整数値が約数かどうかを表示するプログラム

import java.util.Scanner;

class EX03_02{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("整数A：");
			int a=stdIn.nextInt();
			
			System.out.print("整数B：");
			int b=stdIn.nextInt();
		
			if (a % b == 0)
				System.out.println("BはAの約数です。");
			else
				System.out.println("BはAの約数ではありません。");
		}
}
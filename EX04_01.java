//読み込んだ整数値の符号（正/負/0）を判定して表示するプログラム(好きなだけ何度も繰り返す)
import java.util.Scanner;

class EX04_01{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int retry;
		do{
			System.out.print("整数値：");
			int n=stdIn.nextInt();
			
			if (n > 0)
				System.out.println("その値は正です。");
			else if(n < 0)
				System.out.println("その値は負です。");
			else if(n==0)
				System.out.println("その値は0です。");
			
			System.out.print("もう一度？ 1…Yes / 0…No: ");
			retry = stdIn.nextInt();
			
		}while (retry == 1);
	}
}
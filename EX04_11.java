//正の値を0までカウントダウン

import java.util.Scanner;

class EX04_11 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
		
		int x;
		do{
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		}while(x <= 0);
			
		for (int i = x; i >- 0; i--){
			System.out.println(i);
		}
	}
}

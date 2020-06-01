//数当てゲーム (2桁の整数値（10～99）を当てさせる)

import java.util.Random;
import java.util.Scanner;

class EX04_02 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90)+10;
		
		System.out.println("数当てゲーム開始!！");
		System.out.println("10～99の数を当ててください。");
		
		int x;
		do{
			System.out.println("いくつかな？：");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("もっと小さい数だよ。");
			else if(x < no)
				System.out.println("もっと大きい数だよ。");
		}while(x != no);
			
		System.out.println("正解です。");
	}
}

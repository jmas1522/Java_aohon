//数当てゲームのプレイヤーが入力できる回数に制限を設けたプログラム

import java.util.Random;
import java.util.Scanner;

class EX04_27 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int MAX = 7;
		
		int no = rand.nextInt(100);
		
		System.out.println("数当てゲーム開始!！");
		System.out.println("0～99の数を当ててください。");
		System.out.println("入力できる回数は" + MAX + "回だよ！！");
		
		int x;
		int count = 0;
		
		while(true){
			if(count == MAX){
				System.out.println("正解は" + no + "です。");
				System.out.println("ゲームはこれで終了です");
				break;
			}
			
			System.out.println("いくつかな？：");
			x = stdIn.nextInt();
			count++;
			
			if(x > no)
				System.out.println("もっと小さい数だよ。");
			else if(x < no)
				System.out.println("もっと大きい数だよ。");
		}while(x != no);
			
		System.out.println("正解です。");
	}
}

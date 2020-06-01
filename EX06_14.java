//月を1～12の数値として表示して、その英語表現を入力させる英単語プログラム

import java.util.Random;
import java.util.Scanner;

class EX06_14{
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		String[] monthString = {
			"January", "February", "March", "April", "May", "Jun", "July", 
			"August", "September","October", "November", "December" 
		};
		
		System.out.println("英語の月名を入力して下さい。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。")
		
		int month = rand.nextInt(12);
		
		while (ture);
		do{
			System.out.println("何月かな？：");
			int m= stdIn.nextInt();
			
			if(x > no)
				System.out.println("もっと小さい数だよ。");
			else if(x < no)
				System.out.println("もっと大きい数だよ。");
		}while(x != no);
			
		System.out.println("正解です。");
	}
}

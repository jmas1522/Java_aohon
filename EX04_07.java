//読み込んだ個数だけ*と+を交互に表示するプログラム

import java.util.Scanner;

class EX04_07 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個表示しますか：");
		int n = stdIn.nextInt();
		
		int x = 1;
		
		do{
			System.out.print(x % 2 == 1 ? '*' : '+');
			x++;
		}while(x <= n);
	}
}

//読み込んだ個数だけ*を表示

import java.util.Scanner;

class EX04_06_a {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();
		
		int i = 0;
		while(i < n){
			System.out.print('*');
			i++;
		}
		if(n > 0)
		System.out.println();
	}
}

//1からnまでの和を求めるプログラム

import java.util.Scanner;

class EX04_14 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("nの値：");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
			
			System.out.print(i);
			System.out.print(i == n ? "=":"+");
		}
		System.out.println(sum);
	}
}

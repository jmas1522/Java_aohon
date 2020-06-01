//“Ç‚İ‚ñ‚¾ŒÂ”‚¾‚¯*‚ğ•\¦

import java.util.Scanner;

class EX04_06_b {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();
		
		int i = 1;
		while(i <= n){
			System.out.print('*');
			i++;
		}
		System.out.println();
	}
}

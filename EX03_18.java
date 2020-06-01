//“Ç‚İ‚ñ‚¾Œ‚É‘Î‰‚·‚é‹Gß‚ğ•\¦‚·‚éƒvƒƒOƒ‰ƒ€

import java.util.Scanner;

class EX03_18 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("‰½ŒHF");
			int mouth = stdIn.nextInt();
			
			switch(mouth) {
			case 12:
			case  1:
			case  2:System.out.println("“~"); break;
			case  3:
			case  4:
			case  5:System.out.println("t"); break;
			case  6:
			case  7:
			case  8:System.out.println("‰Ä"); break;
			case  9:
			case 10:
			case 11:System.out.println("H"); break;
		}
	}
}
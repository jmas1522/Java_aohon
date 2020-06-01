package aohon07;
//引数mで指定された月の季節を表示するメソッドpromtSeason

import java.util.Scanner;

public class EX07_06 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何月？：");
		int m = stdIn.nextInt();
		
		printSeason(m);
	}

	static void printSeason(int m) {
		switch(m) {
		case 12:
		case  1:
		case  2:System.out.println("冬"); break;
		
		case  3:
		case  4:
		case  5:System.out.println("春"); break;
		
		case  6:
		case  7:
		case  8:System.out.println("夏"); break;
		
		case  9:
		case 10:
		case 11:System.out.println("秋"); break;
		
		default: break;
		}
	}
}
package aohon07;
//読み込んだ正の整数値を返却するメソッドreadPlusInt

import java.util.Scanner;

public class EX07_09 {

	public static void main(String[] args) {

		int n;
		do{
			n = readPlusInt();
		} while (n <= 0);
		
		System.out.println(n);
	}
	
	static int readPlusInt() {
		Scanner stdIn = new Scanner(System.in);
		scanner.close();

		System.out.print("正の整数値：");
		int readPlusInt = stdIn.nextInt();
			
		return readPlusInt;
		
		
	}
}
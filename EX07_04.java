package aohon07;
//1����n�܂ł̑S�����̘a�����߂ĕԋp���郁�\�b�h

import java.util.Scanner;

public class EX07_04 {

	private static int sumUp(int n) {
		int sum = 0;
		
		for (int i = 0; i <= n; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

	System.out.println("1����n�܂ł̘a�����߂܂��B");
	System.out.print("����n�F");	int n = stdIn.nextInt();
	
	System.out.println("1����n�܂ł̘a��" + sumUp(n) +"�ł��B");
	}
}

//配列aの全要素の合計を求めるメソッドsumOf
package aohon07;

import java.util.Random;
import java.util.Scanner;

public class EX07_15 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("配列aの要素数：");	
		int n = stdIn.nextInt();
		int[]a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10) + 1;
		}
		System.out.println("");
		
	static int sumOf(int[]a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
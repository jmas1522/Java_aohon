
package aohon06;

import java.util.Random;
import java.util.Scanner;

public class Java06_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.print("要素数：");
			n = stdIn.nextInt();				// 要素数を読み込む
		} while (n > 10);
		int[] a = new int[n];					// 配列を生成

		for (int i = 0; i < n; i++) {
			int j;
			do {
				j = 0;
				a[i] = 1 + rand.nextInt(10);
				for ( ; j < i; j++)
					if (a[j] == a[i]) break;
			} while (j < i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}

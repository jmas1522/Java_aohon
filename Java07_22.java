/**
 * 
 */
package aohon07;

import java.util.Scanner;

public class Java07_22 {
	
	static int[] arrayClone(int n) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = i;
		}
		return a;
	}

	public static void main(String[] args) {
		java.util.Scanner stdIn = new Scanner (System.in);
		
		System.out.print("—v‘f”‚ÍF");
		int n = stdIn.nextInt();
		int[] x = arrayClone(n);
		
		for (int i = 0; i < n; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}

}

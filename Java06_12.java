package aohon06;

import java.util.Random;
import java.util.Scanner;

public class Java06_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�v�f���F");
		int n = stdIn.nextInt();				// �v�f����ǂݍ���
		int[] a = new int[n];					// �z��𐶐�

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		for (int i = 0; i < 2 * n; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}

		System.out.println("�v�f�����������܂����B");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
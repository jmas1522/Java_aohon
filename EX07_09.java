package aohon07;
//�ǂݍ��񂾐��̐����l��ԋp���郁�\�b�hreadPlusInt

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

		System.out.print("���̐����l�F");
		int readPlusInt = stdIn.nextInt();
			
		return readPlusInt;
		
		
	}
}
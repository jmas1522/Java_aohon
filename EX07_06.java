package aohon07;
//����m�Ŏw�肳�ꂽ���̋G�߂�\�����郁�\�b�hpromtSeason

import java.util.Scanner;

public class EX07_06 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����H�F");
		int m = stdIn.nextInt();
		
		printSeason(m);
	}

	static void printSeason(int m) {
		switch(m) {
		case 12:
		case  1:
		case  2:System.out.println("�~"); break;
		
		case  3:
		case  4:
		case  5:System.out.println("�t"); break;
		
		case  6:
		case  7:
		case  8:System.out.println("��"); break;
		
		case  9:
		case 10:
		case 11:System.out.println("�H"); break;
		
		default: break;
		}
	}
}
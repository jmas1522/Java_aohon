package aohon07;
//�O�̐����l�̒����l�����߂郁�\�b�h

import java.util.Scanner;

public class EX07_03 {

	static int med(int a, int b, int c) {
		int min = a;
		int med = a;
		int max = a;
		
		if (b < min) {
			min = b;
		}else if(b > max){
			max = b;
		}
		
		if (c < min) {
			min = c;
		}else if(c > max){
			max = c;
		}
		
		if(b != min && b != max)	med = b;
		if(c != min && c != max)	med = c;
		return med;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");	int a = stdIn.nextInt();
		System.out.print("����b�F");	int b = stdIn.nextInt();
		System.out.print("����c�F");	int c = stdIn.nextInt();
		
		System.out.println("�����l��" + med (a,b,c) +"�ł��B");
	}
}


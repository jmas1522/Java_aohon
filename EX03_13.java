//�ǂݍ��񂾎O�̐����l�̒����l��\������v���O����

import java.util.Scanner;

class EX03_13 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����lA:");	int a = stdIn.nextInt();
		System.out.print("�����lB:");	int b = stdIn.nextInt();
		System.out.print("�����lC:");	int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) {
		   max = b;
		}
		
		if(c > max) {
		   max = c;
		}
		
		
		int min = b;
		if(a < min) {
		   min = a;
		}
		
		if(c < min) {
		   min = c;
		}
		
		
		int mid = c;
		if(a != max && a != min){
		   mid = a;
		}
		
		if(b != max && b != min){
		   mid = b;
		}
		
		System.out.println("�����l��" + mid + "�ł��B");
	}
}
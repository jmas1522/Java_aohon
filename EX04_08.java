//�ǂݍ��񂾐��̐����l�̌������o�͂���v���O����

import java.util.Scanner;

class EX04_08 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		int x = n;
		int count = 0;
		
		do{
			x /= 10;
			count++;
		}while (x > 0);
		
		System.out.print("���̒l��" + count+ "���ł��B");
	}
}

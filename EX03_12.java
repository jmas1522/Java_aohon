//�ǂݍ��񂾎O�̐����l�̍ŏ��l��\������v���O����

import java.util.Scanner;

class EX03_12 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("�����l:");
			int a = stdIn.nextInt();
			System.out.print("�����l:");
			int b = stdIn.nextInt();
			System.out.print("�����l:");
			int c = stdIn.nextInt();
			
			int min = a;
			if(b < min) min = b;
			if(c < min) min = c;
			
			System.out.println("�ŏ��l��" + min + "�ł��B");
	}
}
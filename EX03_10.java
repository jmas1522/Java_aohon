//�ǂݍ��񂾓�̐����l�̍���\������v���O����

import java.util.Scanner;

class EX03_10 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("�����l:");
			int a = stdIn.nextInt();
			System.out.print("�����l:");
			int b = stdIn.nextInt();
			
			int sa;
			if(a >= b)
				sa = a - b;
			else
				sa = b - a;
			
			System.out.println("�����̍���" + sa + "�ł��B");
	}
}
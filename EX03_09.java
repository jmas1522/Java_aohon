//�ǂݍ��񂾓�̐����l�̑傫���ق��̒l��\������v���O����

import java.util.Scanner;

class EX03_09 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("�����l:");
			int a = stdIn.nextInt();
			System.out.print("�����l:");
			int b = stdIn.nextInt();
			
			int max;
			if(a < b)
				max = b;
			else
				max = a;
			
			System.out.println("�傫���ق��̒l��" + max + "�ł��B");
	}
}
//��̐����l�̏������ق��̒l�Ƒ傫���ق��̒l�����߂ĕ\������v���O����

import java.util.Scanner;

class EX03_14 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("����a:");
			int a = stdIn.nextInt();
			System.out.print("����b:");
			int b = stdIn.nextInt();
			
			if(a == b)
				System.out.println("��̒l�͓����ł��B");
			
			else {
				int min, max;
				if(a < b) {
					min = a;
					max = b;
				} else {
					min = b;
					max = a;
				}
				
				System.out.println("�傫���ق��̒l��" + max + "�ł��B");
				System.out.println("�������ق��̒l��" + min + "�ł��B");
			}
	}
}
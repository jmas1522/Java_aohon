//��̕ϐ����~���i�傫�����j�Ƀ\�[�g���ĕ\������v���O����

import java.util.Scanner;

class EX03_15 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("����a:");
			int a = stdIn.nextInt();
			System.out.print("����b:");
			int b = stdIn.nextInt();
			
			if(a < b) {
				int t = a;
					a = b;
					b = t;
			}
			System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
			System.out.println("�ϐ�a��" + a + "�ł��B");
			System.out.println("�ϐ�b��" + b + "�ł��B");
		}
	}
//�ǂݍ��񂾓�̐����l�̍���10�ȉ����ǂ�����\������v���O����

import java.util.Scanner;

class EX03_11 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("����A:");
			int a = stdIn.nextInt();
			System.out.print("����B:");
			int b = stdIn.nextInt();
			
			int sa = a >= b ? a - b :  b - a;
			
			if(sa <= 10)
				System.out.println("�����̍���10�ȉ��ł��B");
			else
				System.out.println("�����̍���11�ȏ�ł��B");
			
	}
}
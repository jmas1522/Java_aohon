//�ǂݍ��񂾐����l�����ł����10�̔{���ł��邩�ǂ�����\���A���łȂ���΂��̎|��\��

import java.util.Scanner;

class EX03_06{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("�����l�F");
			int n=stdIn.nextInt();
			
			if (n > 0)
				if(n % 10 == 0)
					System.out.println("���̒l��10�̔{���ł��B");
				else
					System.out.println("���̒l��10�̔{���ł͂���܂���");
			else 
				System.out.println("���łȂ��l�����͂���܂����B");
		}
}
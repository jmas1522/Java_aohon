//�ǂݍ��񂾐����l�����ł����3�Ŋ�������]��\���A���łȂ���΂��̎|��\��

import java.util.Scanner;

class EX03_07{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("�����l�F");
			int n=stdIn.nextInt();
			
			if (n > 0)
				if(n % 3 == 0)
					System.out.println("���̒l��3�Ŋ���؂�܂��B");
				else if(n % 3 == 1)
						System.out.println("���̒l��3�Ŋ������]���1�ł��B");
				else 
					System.out.println("���̒l��3�Ŋ������]���2�ł��B");
			else 
				System.out.println("���łȂ��l�����͂���܂����B");
		}
}
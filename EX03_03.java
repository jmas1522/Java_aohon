//�ǂݍ��񂾐����l�̕����i��/��/0�j�𔻒肵�ĕ\��

import java.util.Scanner;

class EX03_03{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("�����l�F");
			int n=stdIn.nextInt();
			
			if (n > 0)
				System.out.println("���̒l�͐��ł��B");
			else if(n < 0)
				System.out.println("���̒l�͕��ł��B");
			else if(n==0)
				System.out.println("���̒l��0�ł��B");
		}
}
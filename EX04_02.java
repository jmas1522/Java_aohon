//�����ăQ�[�� (2���̐����l�i10�`99�j�𓖂Ă�����)

import java.util.Random;
import java.util.Scanner;

class EX04_02 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90)+10;
		
		System.out.println("�����ăQ�[���J�n!�I");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int x;
		do{
			System.out.println("�������ȁH�F");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("�����Ə�����������B");
			else if(x < no)
				System.out.println("�����Ƒ傫��������B");
		}while(x != no);
			
		System.out.println("�����ł��B");
	}
}

//�����ăQ�[���̃v���C���[�����͂ł���񐔂ɐ�����݂����v���O����

import java.util.Random;
import java.util.Scanner;

class EX04_27 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int MAX = 7;
		
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���J�n!�I");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		System.out.println("���͂ł���񐔂�" + MAX + "�񂾂�I�I");
		
		int x;
		int count = 0;
		
		while(true){
			if(count == MAX){
				System.out.println("������" + no + "�ł��B");
				System.out.println("�Q�[���͂���ŏI���ł�");
				break;
			}
			
			System.out.println("�������ȁH�F");
			x = stdIn.nextInt();
			count++;
			
			if(x > no)
				System.out.println("�����Ə�����������B");
			else if(x < no)
				System.out.println("�����Ƒ傫��������B");
		}while(x != no);
			
		System.out.println("�����ł��B");
	}
}

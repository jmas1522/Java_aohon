//�ǂݍ��񂾐����l�v���X�}�C�i�X5�͈̔͂̐����l�������_���ɐ������ĕ\������v���O����

import java.util.Random;
import java.util.Scanner;

class EX02_08 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		
		int b = rand.nextInt(11) - 5;
		System.out.println("���̒l�́}5�̗����𐶐����܂����B�����"+(a + b)+"�ł��B");
	}
}

//�������������ɉ����Ă���񂯂�̎��\������v���O����

import java.util.Random;

class EX03_17 {

	public static void main(String[] args){
		Random rand = new Random();
		
		System.out.print("�R���s���[�^������������F");
		int hand = rand.nextInt(3);
		
		switch(hand) {
			case 0:System.out.println("�O�[");   break;
			case 1:System.out.println("�`���L"); break;
			case 2:System.out.println("�p�[");   break;
		}
	}
}
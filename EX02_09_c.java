//-1.0�ȏ�1.0�����̎����l�������_���ɐ�������v���O����

import java.util.Random;

class EX02_09_c {

	public static void main(String[] args){
		Random rand = new Random();
		
		double a = rand.nextDouble();
		int b = rand.nextInt(2);
		
		System.out.println("�|1.0�ȏ�1.0�����̎����l�F"+(a - b));
	}
}
//float�^�̕ϐ��ƁAdouble�^�̕ϐ���ǂݍ���ŕ\������v���O����

import java.util.Scanner;

class EX05_02 {
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ϐ�x��float�^�ŁA�ϐ�y��double�^�ł��B");
		
		System.out.print("x�F");
		float x = stdIn.nextFloat();
		
		System.out.print("y�F");
		double y = stdIn.nextDouble();
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
	}
}

//�O�̐����l��ǂݍ���ŁA���̍��v�ƕ��ς�\������v���O����(���ς̓L���X�g���Z�q�𗘗p���ċ��߁A�����Ƃ��ĕ\��)

import java.util.Scanner;

class EX05_05 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�̐����l�̍��v�ƕ��ς����߂܂��B");
		
		System.out.print("x�̒l�F");	int x = stdIn.nextInt();
		System.out.print("y�̒l�F");	int y = stdIn.nextInt();
		System.out.print("z�̒l�F");	int z = stdIn.nextInt();
		
		int sum = (x + y + z);
		double avg = (double) sum/3;
		
		System.out.println("�O�̐����l�̍��v��"+ sum +"�ł��B");
		System.out.println("�O�̐����l�̕��ς�"+ avg +"�ł��B");
	}
}

//�e�X�g�̓_���̍��v�_�E���ϓ_�E�ō��_�E�Œ�_��\������v���O����
import java.util.Scanner;

class EX06_06 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		//�l��
		int ninzu;
		do{
			System.out.print("���l�ł����F");
			ninzu = stdIn.nextInt();
		}while (ninzu <= 0);
		
		//�_��
		int tensu[] = new int[ninzu];
		
		for(int i = 0; i < tensu.length; i++){
			System.out.printf((i + 1) + "�Ԗڂ̓_���F");
			tensu[i]= stdIn.nextInt();
		}
		
		//���v�_
		int sum = 0;
		for(int i = 0; i < tensu.length; i++){
			sum += tensu[i];
		}
		
		//�ō��_�E�Œ�_
		
		int max = tensu[0];
		int min = tensu[0];
		for(int i = 0; i < tensu.length; i++){
			if(tensu[i] > max)	max = tensu[i];
			if(tensu[i] < min)	min = tensu[i];
		}
		
		System.out.println();
		System.out.println("���v�_��"+ sum + "�_�ł��B");
		System.out.println("���ϓ_��"+ (sum / (double)ninzu) + "�_�ł��B");
		System.out.println("�ō��_��"+ max + "�_�ł��B");
		System.out.println("�Œ�_��"+ min + "�_�ł��B");
		
	}
}

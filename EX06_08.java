//double�^�̔z��̑S�v�f�̍��v�l�ƕ��ϒl�����߂�v���O����
import java.util.Scanner;

class EX06_08 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int youso;
		do{
			System.out.print("�v�f���F");
			youso = stdIn.nextInt();
		}while (youso < 1);
		
		
		double[] doubles = new double [youso];
		
		for(int i = 0; i < doubles.length; i++){
			System.out.printf("�v�fa[i]�F");
			doubles[i] = stdIn.nextDouble();
		}
		
		
		//���v�_
		double sum = 0;
		for(double i : doubles){
			sum += i;
		}
		
		System.out.println();
		System.out.println("���v�_��"+ sum + "�_�ł��B");
		System.out.println("���ϓ_��"+ (sum / youso) + "�_�ł��B");
		
	}
}

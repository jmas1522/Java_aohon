//�ǂݍ��񂾐��������Z����v���O����(���̒l�͉��Z���Ȃ�)
import java.util.Scanner;

class EX04_26{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("���������Z���A���ς����߂܂��B");
		System.out.print("���v�Z���܂����F");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		for(int i =0; i < n; i++){
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("���̒l�͉��Z���܂���");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("���v��"+ sum +"�ł��B");
		double avg = ((double)sum/count);
		System.out.println("���ς�"+ avg +"�ł��B");
	}
}
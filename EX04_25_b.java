//�ǂݍ��񂾐��������Z����v���O����(���v��1000�𒴂��Ȃ��͈͂ŉ��Z����)
import java.util.Scanner;

class EX04_25_b{

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
			if(sum + t > 1000){
				System.out.println("���v��1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B�B");
				break;
			}
			sum += t;
			count++;
		}
		System.out.println("���v��"+ sum +"�ł��B");
		double avg = ((double)sum/count);
		System.out.println("���ς�"+ avg +"�ł��B");
	}
}
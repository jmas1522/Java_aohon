//�ǂݍ��񂾐��������Z����v���O����(0�����͂��ꂽ��I��)
import java.util.Scanner;

class EX04_25_a{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("���������Z���A���ς����߂܂��B");
		System.out.print("���v�Z���܂����F");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		for(int i =0; i < n; i++){
			System.out.print("����(0�ŏI��)�F");
			int t = stdIn.nextInt();
			if(t == 0){
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
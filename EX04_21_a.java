//���㑤�����p�̒��p�O�p�`��\������v���O����
import java.util.Scanner;

class EX04_21_a{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
			System.out.print("�i���́F");
			n = stdIn.nextInt();
		}while (n < 1);
		
		for(int i = 0; i < n; i++){
			for (int j = (n -i); j > 0; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
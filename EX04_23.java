//n�i�̐����̃s���~�b�h��\������v���O����
import java.util.Scanner;

class EX04_23{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���i�̐����̃s���~�b�h�\�����܂����F");
			n = stdIn.nextInt();
		}while (n < 0);
		
		for(int i =1; i <= n; i++){
			for (int j = (n - i); j > 0; j--){
				System.out.print(' ');
			}
			
			for (int k = 0; k <((i - 1) * 2 + 1); k++){
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
//�ǂݍ��񂾐��̐����l���f���ł��邩�ǂ����𔻒f����v���O����
import java.util.Scanner;

class EX04_24{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("���̐����l�F");
		int n = stdIn.nextInt();
		
		for(int i =2; i <= n; i++){
			if(i == n){
				System.out.println("���̐��͑f���ł��B");
			}else if(n % i == 0){
				System.out.println("���̐��͑f���ł͂���܂���B");
				break;
			}
		}
	}
}
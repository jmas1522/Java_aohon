//�ǂݍ��񂾐����l�̕����i��/��/0�j�𔻒肵�ĕ\������v���O����(�D���Ȃ������x���J��Ԃ�)
import java.util.Scanner;

class EX04_01{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int retry;
		do{
			System.out.print("�����l�F");
			int n=stdIn.nextInt();
			
			if (n > 0)
				System.out.println("���̒l�͐��ł��B");
			else if(n < 0)
				System.out.println("���̒l�͕��ł��B");
			else if(n==0)
				System.out.println("���̒l��0�ł��B");
			
			System.out.print("������x�H 1�cYes / 0�cNo: ");
			retry = stdIn.nextInt();
			
		}while (retry == 1);
	}
}
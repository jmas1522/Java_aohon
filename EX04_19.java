//�G�߂����߂錎�̓ǂݍ��݂ɂ����āA1�`12�ȊO�̒l�����͂��ꂽ�ꍇ�A�ē��͂�����v���O����
import java.util.Scanner;

class EX04_19{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			int retry;
			do{
				int month;
				do{
					System.out.print("�G�߂����߂܂��B\n�����ł����F");
					month = stdIn.nextInt();
					
					if (month >= 3 && month <= 5){
						System.out.println("����͏t�ł��B");
					}else if(month >= 6 && month <= 8){
						System.out.println("����͉Ăł��B");
					}else if(month >= 9 && month <= 11){
						System.out.println("����͏H�ł��B");
					}else if(month == 12 || month == 1 || month == 2){
						System.out.println("����͓~�ł��B");
					}
				
					if(month < 1 || month >12){
						System.out.println("1�`12�܂ł���͂��Ă�������");
				}
			}while(month < 1 || month >12);
			
			System.out.print("������x�H 1�cYes / 0�cNo: ");
			retry = stdIn.nextInt();
			
		}while (retry == 1);
	}
}
//�v�f�^��int�^�ŁA�S�v�f��1�`10�̗����Ŗ��ߐs����(1�ȏ�10�ȉ��̒l��������)�A�A������v�f�������l�������Ȃ��v���O����
import java.util.Random;
import java.util.Scanner;

class EX06_10 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = rand.nextInt(10)+1;
			System.out.println("a["+ i + "] =" +a[i]);
		}
	}
}

//�z��a�̑S�v�f��z��b�ɑ΂��ċt���ɃR�s�[���ĕ\������v���O����
import java.util.Scanner;

class EX06_13 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.printf("a[" + i + "]=");
				a[i] = stdIn.nextInt();
		}
		
		System.out.println();
		for(int i = a.length; i > 0; i--){
			b[i] = a[i];
		}
			
		System.out.println("�z��a�̑S�v�f��z��b�ɑ΂��ċt���ɃR�s�[���܂����B");
		
		for(int i = 0; i < n; i++)
			System.out.println("b[" + i + "]=" + b[i]);
	}
}

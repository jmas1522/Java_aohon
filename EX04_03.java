//��̕ϐ���ǂݍ���ŁA�������ق��̐��ȏ�ő傫���ق��̐��ȉ��̑S���l���������ق����珇�ɕ\������v���O����

import java.util.Scanner;

class EX04_03 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A:");	int a = stdIn.nextInt();
		System.out.print("����B:");	int b = stdIn.nextInt();
		
		int max = a;
		int min = b;
		
		if (max < min){
			int t = max;
			max =min;
			min =t;
		}
		
		int n = min;
		
		do {
			System.out.print(n);
			n = n + 1;
			System.out.print(" ");
		} while (max != n);
		
		System.out.println(n);
	}
}
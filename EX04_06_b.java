//�ǂݍ��񂾌�����*��\��

import java.util.Scanner;

class EX04_06_b {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();
		
		int i = 1;
		while(i <= n){
			System.out.print('*');
			i++;
		}
		System.out.println();
	}
}

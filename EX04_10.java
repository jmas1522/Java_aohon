//�ǂݍ��񂾌�����*��\������v���O����

import java.util.Scanner;

class EX04_10 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++){
			System.out.print('*');
			if(i == n){
		System.out.println();
			}
		}
	}
}

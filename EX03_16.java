//�ǂݍ��񂾎O�̐����l���A�����i���������j�Ƀ\�[�g���ĕ\������v���O����

import java.util.Scanner;

class EX03_16 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la:");	int a = stdIn.nextInt();
		System.out.print("�����lb:");	int b = stdIn.nextInt();
		System.out.print("�����lc:");	int c = stdIn.nextInt();
		
		int max = a;
		int mid = b;
		int min = c;
		
		if(max < mid) {
			int t = max;
			max = mid;
			mid = t;
		}
		
		if(mid < min) {
			int t = mid;
			mid = min;
			min = t;
		}
		
		if(max < mid) {
			int t = max;
			max = mid;
			mid = t;
		}
		System.out.println("a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ��la��" + min + "�ł��B");
		System.out.println("�ϐ��lb��" + mid + "�ł��B");
		System.out.println("�ϐ��lb��" + max + "�ł��B");
	}
}
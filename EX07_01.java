//�󂯎����int�^�̒l�����ł����-1��ԋp���A0�ł����0��ԋp���A���ł����1��ԋp���郁�\�b�h
import java.util.Scanner;

class EX07_01 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�󂯎�����l�����ł����-1��ԋp���A0�ł����0��ԋp���A���ł����1��ԋp����");
		System.out.print("�v�f�F");
		int n = stdIn.nextInt();
		
		int[] hairetu = new int[youso];
		for(int i = 0; i < youso; i++){
			System.out.printf("a[i]�F");
				hairetu[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		for(int i = 0; i < hairetu.length; i++){
			System.out.print(hairetu[i]);
			System.out.print((i + 1 == hairetu.length)?"":",");
		}
		System.out.println("}");
	}
}

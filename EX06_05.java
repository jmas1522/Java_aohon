//�z��̗v�f���ƁA�X�̗v�f�̒l��ǂݍ���ŁA�e�v�f�̒l��\������v���O����
import java.util.Scanner;

class EX06_05 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int youso = stdIn.nextInt();
		
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

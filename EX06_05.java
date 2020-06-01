//配列の要素数と、個々の要素の値を読み込んで、各要素の値を表示するプログラム
import java.util.Scanner;

class EX06_05 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int youso = stdIn.nextInt();
		
		int[] hairetu = new int[youso];
		for(int i = 0; i < youso; i++){
			System.out.printf("a[i]：");
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

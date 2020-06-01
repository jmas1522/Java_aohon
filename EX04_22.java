//n段のピラミッドを表示するプログラム
import java.util.Scanner;

class EX04_22{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("何段のピラミッド表示しますか：");
			n = stdIn.nextInt();
		}while (n < 0);
		
		for(int i =1; i <= n; i++){
			for (int j = (n - i); j > 0; j--){
				System.out.print(' ');
			}
			
			for (int k = 0; k <((i - 1) * 2 + 1); k++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
//n段の正方形を表示するプログラム
import java.util.Scanner;

class EX04_20{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.print("何段の正方形ですか：");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		for(int i =1; i <= n; i++){
			for (int j = 1; j <= n; j++){
				System.out.print('*');
				if(j == n){
					System.out.println();
				}
			}
		}
	}
}
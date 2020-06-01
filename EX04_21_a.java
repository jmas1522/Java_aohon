//左上側が直角の直角三角形を表示するプログラム
import java.util.Scanner;

class EX04_21_a{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.println("左上直角の三角形を表示します。");
			System.out.print("段数は：");
			n = stdIn.nextInt();
		}while (n < 1);
		
		for(int i = 0; i < n; i++){
			for (int j = (n -i); j > 0; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
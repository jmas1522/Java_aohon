//読み込んだ正の整数値が素数であるかどうかを判断するプログラム
import java.util.Scanner;

class EX04_24{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("正の整数値：");
		int n = stdIn.nextInt();
		
		for(int i =2; i <= n; i++){
			if(i == n){
				System.out.println("その数は素数です。");
			}else if(n % i == 0){
				System.out.println("その数は素数ではありません。");
				break;
			}
		}
	}
}
//要素型がint型である配列を作り、全要素を1〜10の乱数で埋め尽くす(1以上10以下の値を代入する。)プログラム
import java.util.Random;
import java.util.Scanner;

class EX06_09 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = rand.nextInt(10)+1;
			System.out.println("a["+ i + "] =" +a[i]);
		}
	}
}

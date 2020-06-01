//配列の全要素に乱数を代入して建て向きの棒グラフを表示するプログラム
import java.util.Random;
import java.util.Scanner;

class EX06_04 {
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);
		System.out.println();
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "]：");
			for(int j = 0; j < a[i]; j++)
				System.out.println('*');
			System.out.println();
		}
	}
}

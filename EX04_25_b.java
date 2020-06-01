//読み込んだ整数を加算するプログラム(合計が1000を超えない範囲で加算する)
import java.util.Scanner;

class EX04_25_b{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数を加算し、平均を求めます。");
		System.out.print("何個計算しますか：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		for(int i =0; i < n; i++){
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if(sum + t > 1000){
				System.out.println("合計が1000を超えました。");
				System.out.println("最後の数値は無視します。。");
				break;
			}
			sum += t;
			count++;
		}
		System.out.println("合計は"+ sum +"です。");
		double avg = ((double)sum/count);
		System.out.println("平均は"+ avg +"です。");
	}
}
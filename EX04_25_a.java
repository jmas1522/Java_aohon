//読み込んだ整数を加算するプログラム(0が入力されたら終了)
import java.util.Scanner;

class EX04_25_a{

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数を加算し、平均を求めます。");
		System.out.print("何個計算しますか：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		for(int i =0; i < n; i++){
			System.out.print("整数(0で終了)：");
			int t = stdIn.nextInt();
			if(t == 0){
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
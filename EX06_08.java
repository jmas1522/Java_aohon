//double型の配列の全要素の合計値と平均値を求めるプログラム
import java.util.Scanner;

class EX06_08 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int youso;
		do{
			System.out.print("要素数：");
			youso = stdIn.nextInt();
		}while (youso < 1);
		
		
		double[] doubles = new double [youso];
		
		for(int i = 0; i < doubles.length; i++){
			System.out.printf("要素a[i]：");
			doubles[i] = stdIn.nextDouble();
		}
		
		
		//合計点
		double sum = 0;
		for(double i : doubles){
			sum += i;
		}
		
		System.out.println();
		System.out.println("合計点は"+ sum + "点です。");
		System.out.println("平均点は"+ (sum / youso) + "点です。");
		
	}
}

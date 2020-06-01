//テストの点数の合計点・平均点・最高点・最低点を表示するプログラム
import java.util.Scanner;

class EX06_06 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		//人数
		int ninzu;
		do{
			System.out.print("何人ですか：");
			ninzu = stdIn.nextInt();
		}while (ninzu <= 0);
		
		//点数
		int tensu[] = new int[ninzu];
		
		for(int i = 0; i < tensu.length; i++){
			System.out.printf((i + 1) + "番目の点数：");
			tensu[i]= stdIn.nextInt();
		}
		
		//合計点
		int sum = 0;
		for(int i = 0; i < tensu.length; i++){
			sum += tensu[i];
		}
		
		//最高点・最低点
		
		int max = tensu[0];
		int min = tensu[0];
		for(int i = 0; i < tensu.length; i++){
			if(tensu[i] > max)	max = tensu[i];
			if(tensu[i] < min)	min = tensu[i];
		}
		
		System.out.println();
		System.out.println("合計点は"+ sum + "点です。");
		System.out.println("平均点は"+ (sum / (double)ninzu) + "点です。");
		System.out.println("最高点は"+ max + "点です。");
		System.out.println("最低点は"+ min + "点です。");
		
	}
}

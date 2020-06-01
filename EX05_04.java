//三つの整数値を読み込んで、その合計と平均を表示するプログラム(平均は実数として表示)

import java.util.Scanner;

class EX05_04 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三つの整数値の合計と平均を求めます。");
		
		System.out.print("xの値：");	int x = stdIn.nextInt();
		System.out.print("yの値：");	int y = stdIn.nextInt();
		System.out.print("zの値：");	int z = stdIn.nextInt();
		
		int sum = (x + y + z);
		double avg = (sum/3.0);
		
		System.out.println("三つの整数値の合計は"+ sum +"です。");
		System.out.println("三つの整数値の平均は"+ avg +"です。");
	}
}

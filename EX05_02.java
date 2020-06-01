//float型の変数と、double型の変数を読み込んで表示するプログラム

import java.util.Scanner;

class EX05_02 {
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		
		System.out.print("x：");
		float x = stdIn.nextFloat();
		
		System.out.print("y：");
		double y = stdIn.nextDouble();
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
	}
}

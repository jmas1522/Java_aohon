//読み込んだ月に対応する季節を表示するプログラム

import java.util.Scanner;

class EX03_18 {

		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("何月？：");
			int mouth = stdIn.nextInt();
			
			switch(mouth) {
			case 12:
			case  1:
			case  2:System.out.println("冬"); break;
			case  3:
			case  4:
			case  5:System.out.println("春"); break;
			case  6:
			case  7:
			case  8:System.out.println("夏"); break;
			case  9:
			case 10:
			case 11:System.out.println("秋"); break;
		}
	}
}
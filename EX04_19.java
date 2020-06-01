//季節を求める月の読み込みにおいて、1～12以外の値が入力された場合、再入力させるプログラム
import java.util.Scanner;

class EX04_19{
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			int retry;
			do{
				int month;
				do{
					System.out.print("季節を求めます。\n何月ですか：");
					month = stdIn.nextInt();
					
					if (month >= 3 && month <= 5){
						System.out.println("それは春です。");
					}else if(month >= 6 && month <= 8){
						System.out.println("それは夏です。");
					}else if(month >= 9 && month <= 11){
						System.out.println("それは秋です。");
					}else if(month == 12 || month == 1 || month == 2){
						System.out.println("それは冬です。");
					}
				
					if(month < 1 || month >12){
						System.out.println("1～12までを入力してください");
				}
			}while(month < 1 || month >12);
			
			System.out.print("もう一度？ 1…Yes / 0…No: ");
			retry = stdIn.nextInt();
			
		}while (retry == 1);
	}
}
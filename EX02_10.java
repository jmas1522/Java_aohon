//名前を読み込んで挨拶するプログラム

import java.util.Scanner;

class EX02_10 {
	
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			
			System.out.print("姓：");
			String a=stdIn.nextLine();
			
			System.out.print("名：");
			String b=stdIn.nextLine();
			
			System.out.println("こんにちは"+a+b+"さん。");
	}
}
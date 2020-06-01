//受け取ったint型の値が負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッド
import java.util.Scanner;

class EX07_01 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("受け取った値が負であれば-1を返却し、0であれば0を返却し、正であれば1を返却する");
		System.out.print("要素：");
		int n = stdIn.nextInt();
		
		int[] hairetu = new int[youso];
		for(int i = 0; i < youso; i++){
			System.out.printf("a[i]：");
				hairetu[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		for(int i = 0; i < hairetu.length; i++){
			System.out.print(hairetu[i]);
			System.out.print((i + 1 == hairetu.length)?"":",");
		}
		System.out.println("}");
	}
}

import java.util.Random;
class EX02_07_a {
	public static void main(String[] args){
		Random rand=new Random();
		int a=rand.nextInt(10);
		System.out.println("一桁の正の整数値"+a);
	}
}
//List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やして行く様子と、List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、横に並べて表示するプログラム

class EX05_06 {
	
	public static void main(String[] args){
		System.out.println("   flat  	int");
		System.out.println("-------------------");
		
		for(flont x = 0.0F, y = 0.0F; x <= 1.0F; x += 0.001F, y++){
			
			float v =(float)y / 1000;
			
			System.out.println("%.7f   %.7f\n", x,v);
		}
	}
}

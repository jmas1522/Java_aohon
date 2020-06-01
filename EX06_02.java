//要素型がint型で、要素数が5の配列に対して、先頭から順に5,4,3,2,1を代入して表示するプログラム

class EX06_02 {
	
	public static void main(String[] args){
		final int MAX=5;
		int[] a = new int[MAX];
		
		for(int i = 0; i < a.length; i++)
				a[i] = MAX - i;
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+ i +"] = "+ a[i]);
	}
}

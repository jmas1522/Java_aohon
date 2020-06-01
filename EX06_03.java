//要素型がdouble型で、要素数が5の配列に対して、先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示するプログラム

class EX06_03 {
	
	public static void main(String[] args){
		final int MAX=5;
		double[] a = new double[MAX];
		
		for(int i = 0; i < a.length; i++)
				a[i] = MAX - i;
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+ i +"] = "+ a[i]);
	}
}

//要素型がdouble型で、要素数が5の配列を生成して、その全要素の値を表示するプログラム

class EX06_01 {
	
	public static void main(String[] args){
		double[]a = new double[5];
		
		a[0] = 0.0;
		a[1] = 0.1;
		a[2] = 0.2;
		a[3] = 0.3;
		a[4] = 0.4;
		
		System.out.println("a["+ 0 +"] = "+ a[0]);
		System.out.println("a["+ 1 +"] = "+ a[1]);
		System.out.println("a["+ 2 +"] = "+ a[2]);
		System.out.println("a["+ 3 +"] = "+ a[3]);
		System.out.println("a["+ 4 +"] = "+ a[4]);
		
	}
}

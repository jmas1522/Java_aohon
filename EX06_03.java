//�v�f�^��double�^�ŁA�v�f����5�̔z��ɑ΂��āA�擪���珇��1.1,2.2,3.3,4.4,5.5�������ĕ\������v���O����

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

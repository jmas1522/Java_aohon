//�v�f�^��int�^�ŁA�v�f����5�̔z��ɑ΂��āA�擪���珇��5,4,3,2,1�������ĕ\������v���O����

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

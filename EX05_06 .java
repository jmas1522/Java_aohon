//List5-9�̂悤�ɁAfloat�^�̕ϐ���0.0����1.0�܂�0.001�����₵�čs���l�q�ƁAList5-10�̂悤�ɁAint�^�̕ϐ���0����1000�܂ŃC���N�������g�����l��1000�Ŋ������l�����߂�l�q���A���ɕ��ׂĕ\������v���O����

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

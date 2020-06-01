/**�A�ԃN���X
 * 
 */
package aohon10;

class Id{
	static int counter = 0;
	
	private int id;
	
	public Id() { 
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	 static int getMaxId(){ 
		 return counter; 
	}
}

public class EX10_01 {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�̎��ʔԍ��F" + a.getId());
		System.out.println("b�̎��ʔԍ��F" + b.getId());
		System.out.println("�Ō�ɗ^�������ʔԍ��F"+ Id.getMaxId()); 
		
		System.out.println("Id.couner = " + Id.counter);
		System.out.println("a.couner  = " + a.counter);
		System.out.println("b.couner  = " + b.counter);
	}
}

/**�A�ԃN���X
 * 
 */
package aohon10;

class ExId{
	static int counter = 0;
	static int n = 1;
	
	private int id;
	
	public ExId() {
		counter += n;
		id = counter;
	}
	
	public int getId() {
		return id;
	}
	
	 static int getMaxId(){ 
		 return counter; 
	}
}

public class EX10_02 {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		
		System.out.println("a�̎��ʔԍ��F" + a.getId());
		System.out.println("b�̎��ʔԍ��F" + b.getId());
		System.out.println("�Ō�ɗ^�������ʔԍ��F"+ Id.getMaxId()); 
		
		System.out.println("Id.couner = " + Id.counter);
		System.out.println("a.couner  = " + a.counter);
		System.out.println("b.couner  = " + b.counter);
	}
}

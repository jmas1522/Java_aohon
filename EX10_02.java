/**連番クラス
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
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("最後に与えた識別番号："+ Id.getMaxId()); 
		
		System.out.println("Id.couner = " + Id.counter);
		System.out.println("a.couner  = " + a.counter);
		System.out.println("b.couner  = " + b.counter);
	}
}

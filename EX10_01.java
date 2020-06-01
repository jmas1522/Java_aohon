/**連番クラス
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
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("最後に与えた識別番号："+ Id.getMaxId()); 
		
		System.out.println("Id.couner = " + Id.counter);
		System.out.println("a.couner  = " + a.counter);
		System.out.println("b.couner  = " + b.counter);
	}
}

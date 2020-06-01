/**銀行口座クラス【第3版】
 * 
 */
package aohon10;

class Account{
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
	
	public Account(String n, String num, long z){
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}

	public long getBalance(){
		return balance;
	}
	
	public int getId(){
		return id;
	}

	public void deposit(long k) {
		balance += k;
	}
	
	public void withdraw(long k) {
		balance -= k;
	}
}

public class EX10_05 {

	public static void main(String[] args) {
		System.out.print("明解銀行での口座開設ありがとうございます。");

	}

}

/**��O�����𗝉����邽�߂̃T���v��
 * 
 */
package aohon16;

import java.util.Scanner;

public class EX16_01 {

	static void check(int sw) throws Exception {
		switch (sw) {
		case 1: throw new Exception("������O����!!");
		case 2: throw new RuntimeException("�񌟍���O����!!");
		}
	}
	
	static void test(int sw) throws Exception{
		check(sw);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw:");	int sw = stdIn.nextInt();
		
		try {
			test(sw);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
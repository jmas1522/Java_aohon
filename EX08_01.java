/**人間クラス【第1版】
 * 
 */
package aohon08;

public class EX08_01 {
	private String name;
	private String todohuken;
	private int age;
	private int weight;
	private int heigth;
	
	EX08_01(String name, String todohuken, int age, int weight, int heigth){
		this.name = name;	this.todohuken = todohuken;	this.age = age;
		this.weight = weight;	this.heigth = heigth; 		
	}
		
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("出身地：" + todohuken);
		System.out.println("年齢：" + age + "歳");
		System.out.println("体重：" + weight  + "kg");
		System.out.println("身長：" + heigth + "cm");
	}
}
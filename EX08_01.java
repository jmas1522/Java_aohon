/**�l�ԃN���X�y��1�Łz
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
		System.out.println("���O�F" + name);
		System.out.println("�o�g�n�F" + todohuken);
		System.out.println("�N��F" + age + "��");
		System.out.println("�̏d�F" + weight  + "kg");
		System.out.println("�g���F" + heigth + "cm");
	}
}
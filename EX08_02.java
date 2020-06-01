/**�����ԃN���X�y��1�Łz
 * 
 */
package aohon08;

public class EX08_02 {
	private String name;
	private int width;
	private int heigth;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private int number;
	
	EX08_02(String name, int width, int heigth, int length, double fuel, int number){
		this.name = name;	this.width = width;	this.heigth = heigth; 
		this.length = length;	this.fuel =  fuel; this.number = number;
		x = y = 0.0;
	}
	
	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return fuel;}
	
	void putSpec() {
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width  + "mm");
		System.out.println("�ԍ��F" + heigth + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
		System.out.println("�Ԃ̃i���o�[�F" + number);
	}
	
	boolean move (double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if (dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}

/**�����ԃN���X�y��2�Łz
 * 
 */
package aohon12;

public class Car {
	private String name;
	private int width;
	private int heigth;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double dist;
	
	public Car(String name, int width, int heigth, int length, double fuel){
		this.name = name;	this.width = width;	this.heigth = heigth; 
		this.length = length;	this.fuel =  fuel;
		x = y = 0.0;
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	public double getFuel() {return fuel;}
	
	public void putSpec() {
		System.out.println("���O�F" + this.name);
		System.out.println("�ԕ��F" + this.width  + "mm");
		System.out.println("�ԍ��F" + this.heigth + "mm");
		System.out.println("�Ԓ��F" + this.length + "mm");
		System.out.println("�����s�����F" + this.dist + "km");
	}
	
	public boolean move (double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if (dist > fuel) {
			return false;
		}else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
	public double totalDist() {
		return this.dist += dist;
	}
}
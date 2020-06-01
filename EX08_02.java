/**自動車クラス【第1版】
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
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + heigth + "mm");
		System.out.println("車長：" + length + "mm");
		System.out.println("車のナンバー：" + number);
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

/**自動車クラス【第2版】の派生
 * 
 */
package aohon12;

public class CarTotal extends Car{

	private double totalDist = 0;
	
	CarTotal(String name, int width, int heigth, int length, double fuel) {
		super(name, width, heigth, length, fuel);
	}
	
	public double totalDist(double dist) {
		totalDist += dist;
		return totalDist;
	}
}
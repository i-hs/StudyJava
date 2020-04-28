package chap09;

public class Coordinate{
	private double x;
	private double y;
	// -- 생성자 -- //
	Coordinate (double x, double y){this.x = x; this.y = y;}
	
	// - 메서드 -- //
	double getX() {return this.x;}
	double getY() {return this.y;}
	
	void setX(double x) { this.x = x;}
	void setY(double y) { this.y = y;}
	void setXY(double x, double y) { this.x = x; this.y = y;}
		
}  //Coordinate

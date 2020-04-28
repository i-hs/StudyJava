package chap08;


class Car{
	private String name;
	private String number;
	private int width;  //폭
	private int height;  //높이
	private int length;  //길이 
	private double x; // x좌표 
	private double y;  //y좌표
	private double tankage;  //탱크 용량
	private double fuel;  //남은 연료
	private double mileage;  //연비
	
	Car(String name, String number, int width, int length, int height, double tankage, double fuel, double mileage){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0; this.y = 0;
		this.tankage = tankage;
		this.fuel = fuel;
		this.mileage = mileage;	
	}  // Car 생성자 
	
	double getX() {return this.x;} 
	double getY() { return this.y;}
	double getFuel() {return this.fuel;}
	void getSpec() {
		System.out.println("자동차명: "+ this.name);
		System.out.println("자동차번호: "+ this.number);
		System.out.println("자동차넓이: "+ this.width);
		System.out.println("자동차높이: "+ this.height);
		System.out.println("자동차길이: "+ this.length);
		System.out.println("자동차배기량: "+ this.tankage);
		System.out.println("자동차연비: "+ this.mileage); 
	}  //getSpec 
	
	void moveCar(double x, double y) {
		this.x += x; this.y += y; 
		double distance = Math.sqrt(x*x + y*y);
		double usedFuel = distance/this.mileage;
		this.fuel -= usedFuel;
		System.out.printf("자동차를 %f만큼 이동합니다. 이동하는 데 드는 연료는 %f입니다.\n남은 연료는 %f입니다.",
				distance, usedFuel, fuel);
	}  //moveCar
	
	void refuel(double amountOfFuel) {
		double cap = this.tankage - this.fuel;
		if (cap<amountOfFuel) amountOfFuel = cap;  
		// 남은 용량보다 많이 주입하면, 연료는 연료탱크가 가득 찰 때 까지만 주입된다.
		
		this.fuel += amountOfFuel;
		System.out.printf("연료를 %f만큼 주입합니다. 현재 남은 연료량은 %f입니다.", amountOfFuel, this.fuel);
	}  //refuel
} //Car 본체 

public class CarClass {

	public static void main(String[] args) {
		Car sonata = new Car("sonata", "7777", 1860, 2840, 1445, 1999, 1900, 19.0);
		
		sonata.getSpec();
		sonata.moveCar(1000, 1500);
		System.out.println("현재 위치: ("+ sonata.getX()+", "+ sonata.getY()+")");
		System.out.println("남은 연료: "+ sonata.getFuel());
		sonata.refuel(100);
		
	} //main

}  //CarClass

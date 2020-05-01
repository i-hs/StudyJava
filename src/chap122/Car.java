package chap122;


class Car{
	private String name;
	private int width;  //폭
	private int height;  //높이
	private int length;  //길이 
	private double x; // x좌표 
	private double y;  //y좌표
	private double fuel;  //남은 연료
	private Day purchaseDay;

	
	Car(String name, int width, int length, int height,  double fuel, Day purchaseDay){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0; this.y = 0;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
		x = y = 0.0;
	}  // Car 생성자 
	public void putSpec() {
		System.out.println("이름: "+ name);
		System.out.println("전폭: "+ width+"mm");
		System.out.println("전고: "+ height+"mm");
		System.out.println("전장: "+ length+"mm");
	}
	
	} //Car 본체 
package chap12;


public class ExCarTester {

	public static void main(String[] args) {
		ExCar myCar = new ExCar("Genesiss", 1845, 1500, 5300, 90.0, new Day());
		myCar.putSpec();
		
		Car sonata = new Car("sonata", 1860, 2840, 1445, 90.0, new Day(2019, 10, 10));
		sonata.putSpec();
	}

}

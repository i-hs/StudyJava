package chap122;



public class CarTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("sonata", 1860, 2840, 1445, 90.0, new Day(2019, 10, 10));
		ExCar car2 = new ExCar("Genesiss", 1845, 1500, 5300, 90.0, new Day());
		
		Car x = new ExCar("Genesiss", 1845, 1500, 5300, 90.0, new Day());
//		x.putSpec();
		
//		ExCar y = (ExCar) new Car("sonata", 1860, 2840, 1445, 90.0, new Day(2019, 10, 10));
		
//		System.out.printf("%f", y.getTotalMileage());
//		y.putSpec();
		
	}

}

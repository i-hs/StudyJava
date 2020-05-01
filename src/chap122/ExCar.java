package chap122;


public class ExCar extends Car{
	private double totalMileage;  // 총 주행거리
	
	// --- 생성자 --- //
	public ExCar ( String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}
	public void putSpec() { //  사양 표시
		super.putSpec();
		System.out.printf("총 주행 거리: %.2fkm\n", totalMileage);
	}
	public double getTotalMileage() {  // 총 주행거리 확인 
		return totalMileage;
	}
}  // ExCar

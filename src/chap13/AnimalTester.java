package chap13;

public class AnimalTester {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치", "치와와");  // 개
		a[1] = new Cat("마이클", 7);  // 고양이
		
		for(Animal s:a) {
			
			s.introduce();
		} // for
	} // main
}  // AnimalTester

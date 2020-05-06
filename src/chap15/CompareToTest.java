package chap15;

public class CompareToTest {

	public static void main(String[] args) {
		String a = "ABC";
		String b = "DEF";
		System.out.println(a.compareTo(b));
		
		double x = 3.1415926;
		int y = 5;
		int z = 3; 
		System.out.printf(String.format("%%%d.%df", y, z), x);
	}

}

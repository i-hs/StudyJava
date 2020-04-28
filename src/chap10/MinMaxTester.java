package chap10;

public class MinMaxTester {

	public static void main(String[] args) {
		int[] x = {100, 70, 1, 30, 64};
		System.out.println("배열 x의 최댓값은: "+ MinMax.max(x));
		System.out.println("배열 x의 최솟값은: "+ MinMax.min(x));
	}

}

package chap10;

public class MinMax {
	
	public static int min(int[] a) {
		int min = 0;
		for (int i=0; i<a.length; i++) {
			min = a[0];
			if (min>a[i]) min=a[i];
		}  //for
		return min;	}  //min
	
	public static int max(int[] a) {
		int max = 0;
		for (int i=0; i<a.length; i++) {
			max = a[0];
			if (max<a[i]) max=a[i];
		}  //for
		return max;	}  //max
}  //MinMax

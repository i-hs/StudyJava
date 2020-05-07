package chap16;

import java.util.Scanner;

public class ReverseArray2 {
	// -- 배열의 요소 a[idx1]와 a[idx2]를 교환 -- //
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// -- 배열 a의 요소를 반대로 나열(오류) -- //
	static void reverse (int[] a) {
		try {
			for(int i=0; i<a.length/2; i++)
				swap(a, i, a.length - i);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		}catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("reverse의 버그? ", e);  // 수정된 코드 부분 
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수: "); 
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		try {
		reverse(x);		// 배열x의 요소를 반대 순서로 나열
		System.out.println("반대로 나열했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x["+i+"]: "+ x[i]);
		} catch (RuntimeException e) {  // 수정된 부분 2
			System.out.println("예외        : "+ e);
			System.out.println("예외의 원인   : "+ e.getCause());
		}
	} 
}

package chap03;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		System.out.print("정수 c:"); int c = stdIn.nextInt();
		
		if (a>b) {  // a보다 b가 크면 a와 b를 교환
		int t = a; 
		a = b; 
		b = t;	
		}
		if (b>c) {  // b보다 c가 크면 b와 c를 교
			int t = b;
			b = c;
			c = t;
		}
		if (c>a) {
			int t = c;
			c = a;
			a = t;
		}
		System.out.println("정렬 결과:" + a + ", "+ b + ", " + c);
		
		final int X = 100;
		System.out.println(X % 10);
	}

}

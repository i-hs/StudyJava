package chap07;

import java.util.Scanner;

public class FindMin {

	static int min(int a, int b) {
		int min = a;
		if (a>b) min = b;
		return min;
	} //min
	
	static int min(int a, int b, int c) {
		int min = a;
		if (a>b) min = b;
		if (min>c) min = c;
		return min;
	}  //min
	
	static int min(int[] d) {
		int min = d[0];
		for(int i=0; i<d.length; i++) {
			if (min>d[i]) min=d[i];
		}
		return min;
	}  //min
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x값: ");
		int x = stdIn.nextInt();
		System.out.print("y값: ");
		int y = stdIn.nextInt();
		System.out.print("z값: ");
		int z = stdIn.nextInt();
		
		System.out.print("배열 x의 크기: ");
		int size = stdIn.nextInt();
		int[] d = new int[size];
		for (int i=0; i<size; i++) {
			System.out.print("배열의 요소 d["+i+"] 입력: ");
			d[i] = stdIn.nextInt(); 
		}  //for
		System.out.println("min(x, y): "+ min(x, y));
		System.out.println("min(x, y, z): "+ min(x, y, z));
		System.out.println("min(d): "+ min(d));
	}  //main

}

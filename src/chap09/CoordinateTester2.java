package chap09;

import java.util.Scanner;

public class CoordinateTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("좌표는 몇 개?:");
		int n = stdIn.nextInt();
		
		Coordinate[] a = new Coordinate[n];  // 요소 수 n개인 Coordinate형 배열
		
		for (int i=0; i<a.length; i++)
			a[i] = new Coordinate(5.5, 7.7);

		for (int i=0; i<a.length; i++)
			System.out.printf("객체 a[%d]=(%f, %f)\n", i, a[i].getX(), a[i].getY());
	
	}

}

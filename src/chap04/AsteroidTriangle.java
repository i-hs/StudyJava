package chap04;

import java.util.Scanner;

public class AsteroidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("*을 이용한 직각삼각형의 층 수를 입력하세요: ");
		int num = stdIn.nextInt();
		
		for (int i=0; i<num; i++) {
			for (int j = 0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}

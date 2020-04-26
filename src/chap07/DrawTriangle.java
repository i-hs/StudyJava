package chap07;

import java.util.Scanner;

public class DrawTriangle {
	static void putChar(char c, int n) {
		while(n-->=0) {
			System.out.print(c);
		} //while
		System.out.println();
	} // putChar
	
	static void putStars(int n) {
		putChar('*', n);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("*을 출력하여 왼쪽 아래가 직각인 삼각형을 출력합니다.\n 삼각형의 층 수를 입력하세요: ");
		int floor = stdIn.nextInt();
		for (int i=0; i<floor; i++) {
			putStars(i);
		} // for
	}  //main

}

package chap04;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("피라미드의 층 수를 입력하세요: ");
		int floorNum = stdIn.nextInt();
		
		for(int i=0; i < floorNum; i++) {
			for(int k=0; k<(floorNum-i-1); k++) {
				System.out.print(" ");
			}
			for(int j = 0; j< (2*i+1); j ++) {
				System.out.print(i+1);
			} System.out.println();
		}

	}

}

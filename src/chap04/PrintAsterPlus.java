package chap04;

import java.util.Scanner;

public class PrintAsterPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("'*'와 '+'를 번갈아 출력합니다. 출력할 총 개수를 입력하세요: ");
		int num = stdIn.nextInt();
		int n = 0;
		
		while (n < num) {
			if (n%2 == 0)
				System.out.print("* ");
			else
				System.out.print("+ ");
			n++;
		}
		
	}

}

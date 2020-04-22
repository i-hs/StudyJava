package chap03;

import java.util.Scanner;

public class Absolute {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 값:");
		int n = stdIn.nextInt();
		int abs;
		
		if (n>0)
			abs = n;
		else
			abs = -n;
		
		System.out.println("절대 값은 "+ abs + "입니다.");
		
	}
}

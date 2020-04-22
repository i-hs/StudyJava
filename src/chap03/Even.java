package chap03;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		int c = 0;
		if(a%2 == 0) c = c + 1;
		if(b%2 == 0) c = c + 1;
		if(c == 0) 
			System.out.println("양 쪽 모두 홀수입니다.");
		else if(c == 1) 
			System.out.println("한 쪽만 홀수입니다.");
		else 
			System.out.println("양 쪽 모두 짝수입니다.");
		
	}

}

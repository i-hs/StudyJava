package chap15;

import java.util.Scanner;

public class LenCharAtTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String s = stdIn.next();
		
		System.out.print("반대로 읽으면 ");
		for(int i = s.length()-1; i>0; i--)
			System.out.print(s.charAt(i));
		System.out.print("입니다.");

	}

}

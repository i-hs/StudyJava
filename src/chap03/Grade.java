package chap03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = stdIn.nextInt()	;
		
		if (point < 0 || point > 100)
			System.out.println("잘못된 점수입니다.");
		else if (point <= 49 && point >= 0)
			System.out.println("가 ");
		
		else if (point <= 59 && point >= 50)
			System.out.println("양 ");
		
		else if (point <= 69 && point >= 60)
			System.out.println("미 ");
		
		else if (point <= 79 && point >= 70)
			System.out.println("우 ");
		
		else if (point >= 80)
			System.out.println("수 ");
		
	}

}

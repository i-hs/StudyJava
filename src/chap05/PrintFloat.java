package chap05;

import java.util.Scanner;

public class PrintFloat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		for(;;) {
		System.out.print("숫자를 입력하세요(99999입력시 종료):");
		float x = stdIn.nextFloat(); 
		System.out.printf("입력하신 숫자는 %8.1f 입니다.\n", x);
		System.out.printf("입력하신 숫자는 %08.1f 입니다.\n", x);
		
		if (x==99999) break;
		
	}

}}

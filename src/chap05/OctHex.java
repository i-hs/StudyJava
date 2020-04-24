package chap05;

import java.util.Scanner;

public class OctHex {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("10진 정수를 입력하세요: ");
		int x = stdIn.nextInt();
		
		System.out.printf("입력하 10진 정수는 %d 입니다.\n", x);
		System.out.printf("변환한 8진수는 %o, 16진수는 %x 입니다.\n",x, x);
//		System.out.printf(format, args);
		
	}

}

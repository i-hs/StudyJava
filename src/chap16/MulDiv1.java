package chap16;

import java.util.Scanner;

public class MulDiv1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x값: "); int x = stdIn.nextInt();
		System.out.print("y값: "); int y = stdIn.nextInt();
		
		System.out.println("x * y = "+ (x*y));
		System.out.println("x / y = "+ (x/y));
		
	}

}

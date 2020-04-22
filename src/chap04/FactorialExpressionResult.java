package chap04;

import java.util.Scanner;

public class FactorialExpressionResult {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("Factorial을 계산합니다. 숫자를 입력하세요: ");
		int num = stdIn.nextInt();
		int numx = num;
		int result = 1;
		for(int i=0; i<num; i++) {
			result *= (num-i);			
			if (num !=(i+1))
				System.out.print((num-i) + " x ");
			else
				System.out.print((num-i) + " = ");
				
		}
		System.out.print(result);
	}

}

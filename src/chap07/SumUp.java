package chap07;

import java.util.Scanner;

public class SumUp {
	
	// 1부터 n까지의 합 
	static int sumUp(int n) {
		int sum=0;
		do {
			sum+= n;
//			n--;
		}while(n-->0);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1부터 n까지 합을 구합니다. n값을 입력하세요: ");
		int n = stdIn.nextInt();
		int result = sumUp(n);
		System.out.printf("n까지의 합은 %d 입니다.", result);
	}

}

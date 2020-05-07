package chap16;

import java.util.Scanner;

public class ThrowAndCatch {
	// -- sw값에 따라 예외 발생 -- //
	static void check(int sw) throws Exception{
		switch(sw) {
		case 1: throw new Exception("검사 예외 발생!");
		case 2: throw new Exception("비검사 예외 발생!");
		}
	}
	
	// -- check를 호출 -- //
	static void test(int sw) throws Exception{
		check(sw);  // 이 호출은 검사 예외Exception 발생 가능성이 있다.
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw: ");
		int sw = stdIn.nextInt();
		try {
			test(sw);
		}catch(RuntimeException e) {  // e: 예외 RuntimeException과 그 하위 클래스를 포착한다.
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

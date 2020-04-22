package chap02;
import java.util.Scanner;

public class ScanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값: ");
		int x = stdIn.nextInt();
		System.out.println(x +"를 입력했습니다.");
		
		System.out.print("문자열 입력:");
		String stdStr = new String();
		stdStr = stdIn.next();
		System.out.print(stdStr+"를 입력했습니다.");
		
		
		
	}

}

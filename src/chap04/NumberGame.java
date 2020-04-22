package chap04;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int no = 10 + rand.nextInt(90);  // 10 ~ 99 난수 생성
		
		System.out.println("숫자 맞추기 시작!");
		System.out.println("10 ~ 99 사이의 숫자를 맞추세요.");
		int x;
		do {
			System.out.print("숫자를 입력하세요: ");
			x = stdIn.nextInt();
			if(x>no)
				System.out.println("더 작은 숫자입니다.");
			else if(x < no)
				System.out.println("더 큰 숫자입니다.");
			
		}while(x != no);
			System.out.println("정답입니다!");
		
	}

}

package chap04;

import java.util.Scanner;

public class InfiniteGroupSum {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int groupNum = 0;
		System.out.println("5개씩 숫자를 더하는 프로그램. \n '99999' 입력시 프로그램 종료. \n '88888' 입력시 그룹 입력 종료.");
		
		Outer:
		for(;;) {
			int sum = 0;
			groupNum++;
			for (int i=0; i<5; i++) {
				System.out.print("숫자를 입력하세요:");
				int x = stdIn.nextInt();
				if (x == 88888) {
					System.out.println("그룹 "+ groupNum +"의 합은 "+sum+"입니다.");
					continue Outer;
					}
				else if (x==99999) {
					System.out.println("그룹 "+ groupNum +"의 합은 "+sum+"입니다.");
					System.out.println("프로그램을 종료합니다.");
					break Outer;
					}
				else
				sum += x;
			}
			System.out.println("그룹 "+ groupNum +"의 합은 "+sum+"입니다.");
		}
			
	}

}

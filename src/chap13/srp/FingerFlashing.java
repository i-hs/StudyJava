package chap13.srp;

import java.util.Scanner;

public class FingerFlashing {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		String[] hands = {"가위", "바위", "보"};
		
		int retry; // 다시 한 번?
		do { // do1
			// 컴퓨터의 손을 생성
			int comp = cp.nextHand();
			
			// 사람의 손 생성
			int user = hp.nextHand();
			
			// 양쪽 손을 표시
			System.out.println("컴퓨터는 "+ hands[comp]+"이고, 당신은 "+ hands[user]+" 입니다.");
			
			//판정
			int judge = (user - comp + 3) %3;
			switch(judge) {
			case 0: System.out.println("비겼습니다.");break;
			case 1: System.out.println("당신이 졌습니다.");break;
			case 2: System.out.println("당신이 이겼습니다.");break;
			}
			
			// 다시 한번 할 지 확인
			do {  // do2
				System.out.print("다시 한 번? 0_아니오 1_예: ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);  // do2
		}while(retry == 1);  // do1
	} // main

}

package chap13.srp;

import java.util.Scanner;

public class HumanPlayer extends Player{
	private static Scanner stdIn;
	static {
		stdIn = new Scanner(System.in);
	}
	
	// -- 손 결정(키보드를 통해 입력) -- //
	public int nextHand() {
		do {
			System.out.print("가위바위보! 0_가위 1_바위 2_보);");
			hand = stdIn.nextInt();
		}while (hand<0 || hand>2);
		return hand;
	}

}

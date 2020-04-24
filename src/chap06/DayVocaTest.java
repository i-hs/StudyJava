package chap06;

import java.util.Random;
import java.util.Scanner;

public class DayVocaTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = {"월", "화", "수", "목", "금", "토"};
		String[] dayEnglish = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String answer = new String();
		Random rand = new Random();
		int day = 0;
		int last = 8; // 초기값이 day와 같지 않도록 설정 
		
		
			System.out.println("요일 영어단어 학습 프로그램.");
			while(true) { // 전
			while (true) { // 난수 생성 
				day = rand.nextInt(7);  // 0~6 의 난수 생성
				if (day==last) continue;   // 지난 회차의 index와 이번 회차의 index가 일치할 경우, 다시 난수 생성 
				else {
						last = day;
						break;
					} // else
			} // while - 난수 생성
			
			while (true) { // Question
			
			System.out.print(dayKorean[day]+"요일을 영어로 쓰시오: ");
			answer = stdIn.next();
			if (answer.toLowerCase().equals(dayEnglish[day].toLowerCase())) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.print("틀렸습니다.");
				System.out.println();
				continue;
			} // else 
			} // while - Question
			
			System.out.print("계속하시겠습니까? 예(0), 아니오(1)");
			int contin = stdIn.nextInt();
			if (contin==1) {
				System.out.println("프로그램 종료.");
				break;  // 종료} 
			}
			else {
				System.out.println("계속합니다.");
				continue;}
			
		} // while - 전체 
	} // main

}

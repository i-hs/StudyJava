package chap02;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("성:"); String lastname = stdIn.next();
		System.out.print("이름:");String firstname = stdIn.next();
		System.out.println("안녕하세요. " + lastname + firstname + "씨.");
		
	}

}

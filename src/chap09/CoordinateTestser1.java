package chap09;

import java.util.Scanner;


public class CoordinateTestser1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요");
		System.out.print("x: "); double x = stdIn.nextDouble();
		System.out.print("y: "); double y = stdIn.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p =("+ p.getX()+", "+ p.getY()+")");
		Coordinate q = p;
		q.setXY(9.9, 9.9);
		System.out.println("p =("+ p.getX()+", "+ p.getY()+")");
		System.out.println("q =("+ q.getX()+", "+ q.getY()+")");
		
		System.out.println(p);
	}  //main

}  // CoordinateTester1

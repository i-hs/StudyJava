package chap12;  // 445page

import java.util.GregorianCalendar;
import java.util.GregorianCalendar.*;

class Day {
	private int year =1; //연
	private int month =1; //월
	private int date =1; //일

	// -- 각 월의 일수 -- //
	private static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
	}; // mdays

	// -- 클래스 메서드 -- //
	// y년은 윤년인가?
	public static boolean isLeap(int y) {
		return y%4 == 0;
	}
	
	
	
	
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(GregorianCalendar.YEAR);
		this.month = today.get(GregorianCalendar.MONTH) + 1;
		this.date = today.get(GregorianCalendar.DATE);
	}
	public Day(int year) {  // Year년 1월 1
		this.year= year;
	}
	
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
} //class Day

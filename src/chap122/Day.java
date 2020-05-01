package chap122;  // 445page

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
		return y%4 == 0 && y%100 != 0 || y%400 ==0; 
	}
	// ---- y 년 m월의 일수  ---//
	private static int dayOfMonth(int y, int m) {
		return mdays[isLeap(y)? 1:0][m-1];
	}
	
	// -- 조정된 m월(1~12 범위 외의 값을 조정 -- //
	private static int adjustedMonth(int m) {
		return m < 1? 1:m >12? 12:m;
	}
	// --- 조정된 y년 m월의 d일(1 ~ 28/29/30/31 범위 외의 값을 조정) ---//
	private static int adjustedDay(int y, int m, int d) {
		if (d<1) return 1;
		int dMax = dayOfMonth(y, m);   // y년 m월의 일수
		return d > dMax? dMax:d ;}
	
	public static int compare(Day d1, Day d2) {  // 두 날짜의 전후 관계 
		if(d1.year > d2.year ) return 1;  // 연이 다르다
		if(d1.year < d2.year ) return -1;  // 연이 다르다
											// 연이 같다.
		
		if(d1.month < d2.month) return 1;  // 월이 다르다
		if(d1.month > d2.month) return -1;  // 월이 다르다
		
		return d1.date > d2.date ? 1 : d1.date < d2.date? -1 : 0;  // 일도 같다.
		
	} //compare
	
	
	// -- 생성자 --( 오늘 날짜 ) -- //
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(GregorianCalendar.YEAR);
		this.month = today.get(GregorianCalendar.MONTH) + 1;
		this.date = today.get(GregorianCalendar.DATE);
	}
	public Day(int year) {  // Year년 1월 1일 
		this.year= year;
	}
	
	public Day(int year, int month) {  // year년 month월 1일 
		this(year);
		this.month = month;
	}
	
	public Day (int year, int month, int date) {  // year년 month월 date일 
		this(year, month);
		this.date = date;
	}
	
	public Day(Day d) { // Day 객체를 생성자에 입력 받았을 
		this(d.year, d.month, d.date);
	}
	
//	인스턴스 메소드
	public int getYear() {  // year 가져오기 
		return this.year;
	}
	public int getMonth() {  // Month 가져오기 
		return this.month;
	}
	public int getDate() {  // date 가져오기 
		return this.date;
	}
	
	public void setYear(int year) {  // year 설정 
		this.year = year;
		this.date = adjustedDay(year, this.month, this.date);
	}
	
	public void setMonth(int month) {  // Month 설정 
		this.year = adjustedMonth(month);
		this.date = adjustedDay(this.year, this.month, this.date);
	}
	
	public void setDate(int date) {  // Date 설정 
		this.date = adjustedDay(year, this.month, date);
	}
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = adjustedMonth(month);
		this.date = adjustedDay(this.year, this.month, date);
	}
	
	public boolean isLeap() {  //윤년인지 구하는 인스턴스 메소드
		return isLeap(year);  //클래스 메소드 호출 
	}
	
	public int dayOfWeek() {  // 요일 구하기 
		// 0  1 2  3 4  5 6
		// 일 월 화 수 목 금 토
		int y = year;
		int m = month;
		if(m ==1 || m==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13 * m + 8) / 5 + date)%7;
	}  // dayOfWeek
	
	public boolean equalTo(Day d) {  // 날짜 d와 비교 
		return year == d.year && month == d.month && date == d.date;
	}
	
	public String toString() {
		String[] wd = {"일", "월", "화", "수", "목", "금", ""};
		return String.format("%04년 %02월 %02일(%s)", year, month, date, wd[dayOfWeek()]);
	} // toString
	
	
	public int dayOfYear() {  // 연내 경과 일수 
		int days = date;
		for(int i=1; i<month; i++)
			days+= dayOfMonth(year, i);
		return days;
	}  //dayOfYear
	
	public int leftDayOfYear() {  // 연내 잔여 일
		return 365 + (isLeap(year)? 1: 0) - dayOfYear();
	}  //leftDayOfYear
	
	public int compareToDay(Day d) { // 날짜 d와 전후 관계
		return compare(this, d);
	}  //compareToDay
	
	public void succeed() {  // 날짜를 하루 뒤로 변경 
		if( date < dayOfMonth(year, month))
			date ++;
		else {
			if( ++month > 12) {
				year++;
				month = 1;
			} // if
			date = 1;
		} // else
		} // succeed
	
	public Day succeedingDay() {  // 하루 뒤 날짜를 반환 
		Day temp = new Day(this);
		temp.succeed();
		return temp;
	}  // succeedingDay
	
	
	public void precede() {  // 날짜를 하루 앞으로 변경 
		if (date>1)
		date--;
		else {
			if( -- month < 1) {
				year--;
				month = 12;
			}  // if
		}  // else
	}  // precede
	
	public Day precedingDay() {  // 하루 앞 날짜를 반환
		Day temp = new Day(this);
		temp.precede();
		return temp;
	}
	
	public void succeedDays(int n) {  // 날짜를 n일 뒤로 변경 
		if(n<0)
			precedeDays(-n);
		else if (n>0) {
			date += n;
			while(date > dayOfMonth(year, month)) {
				date -= dayOfMonth(year, month);
				if (++month > 12) {
					year++;
					month =1;
				}  // if
			}  // while
		} // else if
	}  // succeedDays
	
	public Day after(int n) {  // n일 뒤의 날짜를 반환 
		Day temp = new Day(this);
		temp.succeedDays(n);
		return temp;
	}
	
	public void precedeDays(int n) {  // 날짜를 n일 앞으로 변경 
		if (n<0)
			succeedDays(-n);
		else if (n>0) {
			date -= n;
			while (date <1) {
				if (--month <1) {
					year--;
					month = 12;
				} // if
				date += dayOfMonth(year, month);
			}  // while
		}  // else if
	}  // precedeDays
	
	public Day before(int n) {  // n일 앞의 날짜를 반환 
		Day temp = new Day(this);
		temp.precedeDays(n);
		return temp;
	}
	public String getString() {
		return (String.valueOf(this.getYear())+ "." + String.valueOf(this.getMonth())
		+ "." + String.valueOf(this.getDate()));
	}
	
} //class Day

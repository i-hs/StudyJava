package chap10;

import java.util.Calendar;
import java.util.GregorianCalendar;

class GetMembers {
	private static int idNumber = 0;
	private static int day;
	private String id = new String();
	private String password = new String();
	private String phoneNumber = new String();
	
	
	// -- 클래스 초기화 블록 -- //
	static {
		GregorianCalendar today = new GregorianCalendar();  // 현재 날짜 
		day = today.get(Calendar.DATE);  // today의 일 
	}  //class initiation
	
	// -- 인스턴스 초기화 블록 -- //
	{
		if(++idNumber%10 == day%10) {
			System.out.println("당첨입니다.");
		}  // if
	}  // instance initiation
	
	public GetMembers(String id, String password, String phoneNumber) {
		this.id = id; this.password = password; this.phoneNumber = phoneNumber;
		System.out.printf("%s님 가입을 환영합니다.\n 회원님은 %d번째 고객님이십니다.", this.id, idNumber);
	}
	
	
}  // GetMembers

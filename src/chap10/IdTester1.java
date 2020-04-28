package chap10;

public class IdTester1 {

	public static void main(String[] args) {
		Id a = new Id("morning","1234", "01012341234" );
		Id b = new Id("coding","5678", "01045674567" );
		
		System.out.println("a의 nickname: "+ a.getNickname());
		System.out.println("b의 nickname: "+ b.getNickname());
		System.out.println("a의 phoneNumber: "+ a.getPhoneNumber());
		System.out.println("b의 phoneNumber: "+ b.getPhoneNumber());
		
		System.out.println("회원 수:"+ Id.getIdNumber());
	}  //main

} // IdTester1

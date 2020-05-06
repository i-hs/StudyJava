package chap15;

public class TestIntern {

	public static void main(String[] args) {
		String s1 = "DEF";
		String s2 = "ABC" + s1;
		String s3 = "ABC" + s1;
		
		System.out.println("1. s2과 s3는 같은 문자열 리터럴을 참조"+
				((s2==s3)?"하고 있다.":"하지 않고 있다."));
		
		s2 = s2.intern();
		s3 = s3.intern();
		System.out.println("2. s2과 s3는 같은 문자열 리터럴을 참조"+
				((s2==s3)?"하고 있다.":"하지 않고 있다."));
		
	}

}

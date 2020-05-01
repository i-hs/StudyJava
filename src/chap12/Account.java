package chap12;

class Account {
	private static int counter = 0; // 몇 번 까지 식별 번호를 부여했는가
	 
	private String name;  // 계좌 명의
	private String no;  // 계좌 번호
	private long balance;  // 잔고 
	private Day openDay;  // 계좌 개설일
	private int id;   // 식별 번호 
	
	
	// 인스턴스 초기화 블록
	{
		id = ++ counter;  // 식별 번호 
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}
	
	
	// -- 생성자 -- //
	public Account(String name, String no, long balance, Day openDay) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(openDay);
	
	}
	// 생성자  : 예금액은 0이고 계좌 개설일은 오늘   
	public Account(String name, String no) {
		this(name, no, 0, new Day());
	}
	public Account(String name, String no, long balance) {
		this(name, no, balance, new Day());
	}
	// -- 계좌 명의 확인 -- //
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}
	public Day getOpenDay() {
		return new Day(openDay);
	}
	void deposit(long k) {  // k원 입금 
		balance += k;
	}
	
	// -- 문자열 표현에 의한 계좌 기본 정보 반환 -- //
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}
} // Account

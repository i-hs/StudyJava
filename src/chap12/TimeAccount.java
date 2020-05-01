package chap12;

class TimeAccount extends Account{
	private long timeBalance;  // 예금잔액 
	
	// 생성자
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	// 정기 예금 잔액 확인
	long getTimeBalance() {
		return timeBalance;
	}
	
	// 정기 예금을 해약하고 전액을 보통 예금으로 이체
	void cancel() {
		deposit(timeBalance);
		timeBalance=0;
	}
}

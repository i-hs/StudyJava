package chap12;

public class AccountCompare {

	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount?
		(((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalance()) : a.getBalance();
		long totalBalanceB = b instanceof TimeAccount?
		(((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance()) : b.getBalance();
	if (totalBalanceA > totalBalanceB)
		return 1;
	else if (totalBalanceA < totalBalanceB)
		return -1;
	else
		return 0; 
	}  // compBalance
	
	public static void main(String[] args) {
		Account doolly = new Account("둘리", "123456", 500);
		TimeAccount chulsua = new TimeAccount("철수", "654321", 300, 400);
		System.out.println("둘리와 철수의 예금잔액 비교 결과입니다.");
		switch(compBalance(doolly, chulsua)) {
		case  0: System.out.println("두 사람의 잔액이 같습니다.");
		case  1: System.out.println("둘리의 잔액이 많습니다.");
		case -1: System.out.println("철수의 잔액이 많습니다.");
		}
	}

}

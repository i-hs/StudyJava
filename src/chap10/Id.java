package chap10;

class Id {
	private static int idNumber=0;  // 회원 수는 몇 명인가 ? 
	private String nickname = new String();
	private String password = new String();
	private String phoneNumber;
	
	// --생성자 --//
	public Id(String nickname, String password, String phoneNumber) {
		this.nickname = nickname;
		this.password = password;
		this.phoneNumber = phoneNumber;
		idNumber += 1;
	} //Id 생성자 
	
	static int getIdNumber() {  	// 식별 번호 가져오기 
		return idNumber;
	} // getNumber
	
	String getNickname() {	return this.nickname;}
	String getPhoneNumber() {	return this.phoneNumber;}
	
} // class Id

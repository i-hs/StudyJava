package chap13;

abstract class Animal {
	private String name;
	public Animal(String name) { this.name = name;}
	public abstract void bark();  // 짖기
	public String getName() {return name;}  // 이름 확인 
	public abstract String toString();
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	};
}

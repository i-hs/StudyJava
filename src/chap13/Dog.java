package chap13;

class Dog extends Animal{
	private String type; // 개의 품종
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	@Override
	public void bark() {System.out.println("멍멍!");}
	@Override
	public String toString() {
		return type + "의 " + getName();
	}
}  // Dog

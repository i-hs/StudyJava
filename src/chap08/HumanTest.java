package chap08;


class Human{  //Human 클래스의 name, height, weight 필드(field)
	private String name;
	private int height;
	private int weight; 
	
	//-- 생성자 --//
	Human (String n, int h, int weight){
		this.name = n; this.height = h; this.weight = weight;
		// this.weight를 사용하게 되면 class의 멤버변수의 field를 지목하게 되며,
		// weight는 Human 생성자 파라미터parameter로부터 받은 아규먼argument 값이 된다.
	} //생성
	
	String getName() {return name;}  // 이름 가져오
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	
	void eat(String food) {  //Human 클래스의 eat 메서드(method)
		System.out.println(name+"은 "+ food+"을(를) 먹습니다.");
	} //food
	
}  //Human

public class HumanTest {

	public static void main(String[] args) {
		Human gildong = new Human("홍길동", 170, 70);
		Human chulsu = new Human("철수", 180, 75);
		
		
		System.out.println("이름: "+ gildong.getName());
		System.out.println("키: "+ gildong.getHeight()+ "cm");
		System.out.println("몸무게: "+ gildong.getWeight()+ "kg");

		System.out.println("이름: "+ chulsu.getName());
		System.out.println("키: "+ chulsu.getHeight()+ "cm");
		System.out.println("몸무게: "+ chulsu.getWeight()+ "kg");
		
		gildong.eat("치킨");
		chulsu.eat("된장찌개");
	} //main

}

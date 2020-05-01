package chap13.draw;

/**
 * Point 클래스는 점을 나타내는 클래스이다.
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape으로부터 파생된 클래스이다.
 * 필드는 없다.
 * @author ihyeonseung
 * @see Shape
 *
 */
public class Point extends Shape{
	/**
	 * 점을 생성하는 클래스이다.
	 * 받는 인수가 없다.
	 */
	public Point() {
		// 아무 것도 하지 않는다.
	}
	/**
	 * toString메서드는 점에 관련된 도형정보를 문자열로 변환한다. 
	 * 반환하는 문자열은 항상 Point이다.
	 * @return 문자열 "Point"를 반환한다.
	 */
	
	public String toString() {
		return "Point";
	}
	
	/**
	 * draw는 점을 그리는 메서드이다.
	 * 플러스 기호 '+' 1개만 표시하고 줄 바꿈한다. 
	 */
	public void draw() {
		System.out.println('+');
	}
}
package chap13.draw;
/**
 * AbstLine 클래스는 직선을 나타내는 추상 클래스이다.
 * 도형을 나타내는 추상 클래스 Shape로부터 파생되는 클래스이다.
 * @author ihyeonseung
 * @see Shape
 * @see HorzLine VertLine
 *
 */
public abstract class AbstLine extends Shape{
	/**
	 * 직선의 길이를 나타내는 int형 필드
	 */
	private int length;
	
	/**
	 * 직선을 생성하는 생성자이다.
	 * 길이를 인수로 받는다.
	 * @param length 생성할 직선의 길이
	 */
	public AbstLine(int length) {
		setLength(length);
	}
	
	/** 
	 * 직선의 길이를 반환한다
	 * @return 생성할 직선의 길이 
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * 직선의 길이를 설정한다.
	 * @param length 설정할 직선의 길이
	 */
	public void setLength(int length) {
		this.length = length; 
	}
	/** 
	 * toString 메서드는 직선에 관련된 도형 정보를 문자열로 반환한다.
	 * @return 문자열 "AbstLine(length:3)"을 반환한다.
	 * 3 부분은 길이에 해당하는 값이다. 
	 */
	
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}
}

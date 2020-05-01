package chap13.draw;
/** 
 * 
 * @author ihyeonseung
 * @see Object
 */


public abstract class Shape {
	
	public abstract String toString();  // 도형의 정보를 출력하는 메서드
	public abstract void draw();  // 도형을 그리기 위한 메서드 
	/**
	 * print 메서드는 도형의 정보를 표시한 뒤 도형을 그린다.
	 *Step 1. toString 메서드가 반환하는 문자열을 표시하고 줄 바꿈.
	 *Step 2. draw 메서드를 호출해서 도형을 그림.
	 */
	public void print() {
		System.out.println(toString());
		draw();
	}
}

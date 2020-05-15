package chap17.property;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTester {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("홍길동");
		ts.add("홍길동");
		ts.add("차범");
		ts.add("유재석");
		ts.add("김유신");
		
		
		Iterator ite = ts.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("========");
		Iterator ite2 = ts.descendingIterator();
		while(ite2.hasNext())
			System.out.println(ite2.next());
	}

}

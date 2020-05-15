package chap17.property;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTester {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("홍길동", "서울시");
		
		Set set = tm.descendingKeySet(); // 오름차순 키 반환
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			String key = (String)ite.next();
			String value = (String)tm.get(key);
			System.out.println("key: "+key + "value: " + value);
		}
	}

}

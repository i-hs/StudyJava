package chap17.arrayList;

import java.util.HashMap;
import java.util.Map;

import chap17.hashSet.MyStudent;

public class HashMapTest {

	public static void main(String[] args) {
		Map map = new HashMap(); 
		
		map.put(1,  new Integer(100));
		map.put("second", "HelloWorld!");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Integer i = (Integer) map.get(1);
		String str = (String) map.get("second");
		System.out.println(i);
		System.out.println(str);
		MyStudent st = (MyStudent) map.get("third");
		System.out.println(st);
	}

}

package chap17.arrayList;

import java.util.ArrayList;
import java.util.List;

import chap17.hashSet.MyStudent;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(new Integer(178));
		list.add(new MyStudent());
		list.add(4.56f);
		list.add(178);
		list.add("Hello");
//		String name = list.get(0); // 오류 발생 
		String name = (String) list.get(0); // downcasting
		int in1 = (Integer) list.get(1);
		System.out.println("name: "+ name);
		System.out.println("in1: "+ in1);
		list.remove(0);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}

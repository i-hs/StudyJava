package chap17.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add(178);
		set.add(4.56f);
		set.add("Hello");  // 중복 불가 
		set.add(178);
		set.add(new MyStudent());
		Object[] obj = set.toArray();  // 배열화 시켜서 저장
		System.out.println(set);
		System.out.println(obj);
		for(int i=0; i<set.size();i++) {
			System.out.print(obj[i]);
		}

	}

}

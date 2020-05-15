package chap17.property;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("name",  "홍길동");
		
		String name = p.getProperty("name");
		
		Enumeration e = p.propertyNames();
		System.out.println(name);
		System.out.println(e);
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println((key+" = "+ p.getProperty(key)));
		}
		
	}

}

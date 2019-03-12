package sample3;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		Properties per = new Properties();
		per.setProperty("1", "1111");
		per.setProperty("2", "2222");
		per.setProperty("3", "3333");
		System.out.println(per);
		System.out.println();
		Enumeration<String> res = (Enumeration<String>) per.propertyNames();
		while (res.hasMoreElements()) {
			String key = res.nextElement();
			System.out.println(key + ":" + per.getProperty(key));
		}

	}
}

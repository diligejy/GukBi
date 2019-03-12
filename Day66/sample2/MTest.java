package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("sample2/applicationContext.xml");
		/*
		 * id id의 타입 Address ar = app.getBean("myaddr01", Address.class);
		 * System.out.println(ar);
		 */

		// getBean(id) = Object Return => Address로 캐스팅
		// 1. Address의 기본 생성자 호출
		Address ar = (Address) app.getBean("myaddr01");
		System.out.println(ar);
		// 2. Address의 매개인자 대입 생성자 호출
		ar = (Address) app.getBean("myaddr02");
		System.out.println(ar); // 홍길동 서울시 02-000-0000
		
		// 3. ListAddress의 기본 생성자 호출
		ListAddress list = app.getBean("myList01", ListAddress.class);
		System.out.println(list.getAddress()); 
		
		// 4. ListAddress의 매개인자 생성자 호출
		list = app.getBean("myList02", ListAddress.class);
		System.out.println(list.getAddress());
	}
}

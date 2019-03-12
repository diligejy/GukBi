package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest02 {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("sample2/applicationContext.xml");
		// Setter Injection(DI)

		// 1. Address Setter DI
		Address ar = app.getBean("myaddr03", Address.class);
		System.out.println(ar);
		
		// 2. ListAddress Setter DI
		ListAddress list_ar = app.getBean("myList03", ListAddress.class);
		System.out.println(list_ar.getAddress());

	}
}

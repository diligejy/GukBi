package sample12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample12/applicationContext.xml");
		Foo obj = (Foo) factory.getBean("fooTest");
		obj.fooMethod();
		
	}
}

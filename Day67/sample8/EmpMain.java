package sample8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample8/applicationContext.xml");
		Developer d1 = (Developer) factory.getBean("developer");
		System.out.println(d1.toString());
		
		Engineer d2 = (Engineer) factory.getBean("engineer");
		System.out.println(d2.toString());
		
		((AbstractApplicationContext) factory).close();

	}
}

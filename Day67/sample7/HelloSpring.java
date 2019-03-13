package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample7/applicationContext.xml");
		MessageBeanImpl mb = (MessageBeanImpl) factory.getBean("2");
		mb.helloCall();
	}
}

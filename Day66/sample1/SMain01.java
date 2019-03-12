package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMain01 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample1/mybean.xml");
		MessageBean bean = (MessageBean) factory.getBean("my01");
		bean.Prn();
		System.out.println("=========================================");
		bean = (MessageBean) factory.getBean("my02");
		bean.Prn();
		System.out.println("=========================================");
		bean = (MessageBean) factory.getBean("my03");
		bean.Prn();
		System.out.println("=========================================");
		bean = (MessageBean) factory.getBean("my04");
		bean.Prn();

	}
}

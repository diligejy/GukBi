package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {
	public BirthdayEx() {
	}

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/data.xml");
		
		DateVo bean = (DateVo) factory.getBean("hong");
		System.out.println(bean.toString());
		bean = (DateVo) factory.getBean("lee");
		System.out.println(bean);
	}
}

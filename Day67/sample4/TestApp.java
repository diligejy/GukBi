package sample4;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/app.xml");

		AbstractTest bean = (AbstractTest) factory.getBean("test");

		System.out.println("ø¿¥√¿∫" + bean.dayinfo());

		Calendar cl = factory.getBean("myCalendar", Calendar.class);
		System.out.println(cl.getTime() + "\n");

		((AbstractApplicationContext) factory).close();
		System.out.println("ø¿¥√¿∫" + bean.dayinfo() + ":" + factory.getId());
	}
}

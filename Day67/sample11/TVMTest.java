package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVMTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample11/applicationContext.xml");
		System.out.println("Spring IOC �����̳� �ʱ�ȭ �� ...");

		TV tv = (TV) factory.getBean("samsung");
		tv.powerOn();
		tv.VolumnDown();
		tv.volumnUp();
		tv.powerOff();
	}
}

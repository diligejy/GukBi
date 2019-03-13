package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public EmpMain() {

	}

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/beans.xml");
		// Emp b1 = new Developer("¼¼Á¾´ë¿Õ", 1500000, "°³¹ß1ÆÀ");
		Emp b1 = (Emp) factory.getBean("developer");
		System.out.println(b1);
		Emp b2 = (Emp) factory.getBean("engineer");
		System.out.println(b2);
		Emp b3 = factory.getBean("myemp", Developer.class);
		System.out.println(b3.toString());//°­°¨Âù, 2000000, °³¹ß2ÆÀ
		Emp b4 = (Emp) factory.getBean("myres");
		System.out.println(b4);
		((ClassPathXmlApplicationContext) factory).close();

	}
}

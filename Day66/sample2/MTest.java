package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("sample2/applicationContext.xml");
		/*
		 * id id�� Ÿ�� Address ar = app.getBean("myaddr01", Address.class);
		 * System.out.println(ar);
		 */

		// getBean(id) = Object Return => Address�� ĳ����
		// 1. Address�� �⺻ ������ ȣ��
		Address ar = (Address) app.getBean("myaddr01");
		System.out.println(ar);
		// 2. Address�� �Ű����� ���� ������ ȣ��
		ar = (Address) app.getBean("myaddr02");
		System.out.println(ar); // ȫ�浿 ����� 02-000-0000
		
		// 3. ListAddress�� �⺻ ������ ȣ��
		ListAddress list = app.getBean("myList01", ListAddress.class);
		System.out.println(list.getAddress()); 
		
		// 4. ListAddress�� �Ű����� ������ ȣ��
		list = app.getBean("myList02", ListAddress.class);
		System.out.println(list.getAddress());
	}
}

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanMain {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test/applicationContext.xml");
		Human ob1 = factory.getBean("per1", Human.class);
		System.out.println(ob1.sayName("ȫ�浿"));
		System.out.println(ob1.sayJob("������ ȫ�浿"));

		Human ob2 = factory.getBean("per2", Human.class);
		System.out.println(ob2.sayName("���浿"));
		System.out.println(ob2.sayJob("������ ���浿"));

		Human ob3 = factory.getBean("per3", Human.class);
		System.out.println(ob3.sayName("�ڱ浿"));
		System.out.println(ob3.sayJob("���� ȫ�浿"));
		
		((AbstractApplicationContext) factory).close();
		
	}

}

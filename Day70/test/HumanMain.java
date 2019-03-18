package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanMain {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test/applicationContext.xml");
		Human ob1 = factory.getBean("per1", Human.class);
		System.out.println(ob1.sayName("홍길동"));
		System.out.println(ob1.sayJob("개발자 홍길동"));

		Human ob2 = factory.getBean("per2", Human.class);
		System.out.println(ob2.sayName("정길동"));
		System.out.println(ob2.sayJob("개발자 정길동"));

		Human ob3 = factory.getBean("per3", Human.class);
		System.out.println(ob3.sayName("박길동"));
		System.out.println(ob3.sayJob("가수 홍길동"));
		
		((AbstractApplicationContext) factory).close();
		
	}

}

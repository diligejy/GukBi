package sample14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample14/applicationContext.xml");
		MyFoodMgr mfm = (MyFoodMgr) factory.getBean("myFood");
		System.out.println(mfm.toString());
		
	}

}

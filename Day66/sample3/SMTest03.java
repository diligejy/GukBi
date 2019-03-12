package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest03 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample3/applicationContext.xml");
		UserVo res = (UserVo) factory.getBean("mvo");
		System.out.println(res.getMy_date());
		System.out.println(res.getPer());

		UserService rs = factory.getBean("my", UserServiceImpl.class);
		rs.addUser(res);
	}
}

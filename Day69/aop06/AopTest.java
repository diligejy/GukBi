package aop06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.MemberController;
import data.MemberDTO;

public class AopTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop06/applicationContext.xml");
		
		MemberController control = context.getBean("memberController", MemberController.class);
		
		MemberDTO memberDto = new MemberDTO();
		memberDto.setName("ȫ�浿");
		memberDto.setId("spring");
		
		int cnt = control.insertMember(memberDto);
		System.out.println("insert cnt :" + cnt);
		
		//List<MemberDTO> list = control.getList(null);
	}
}

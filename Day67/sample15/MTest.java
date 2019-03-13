package sample15;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample15/applicationContext.xml");

		MemberDAO memberDAO = (MemberDAO) factory.getBean("memberDAO");
		MemberDTO m = new MemberDTO("111", "111", "111");

		try {
			int r = memberDAO.getInsert(m);
			if (r > 0) {
				System.out.println("입력성공이야");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

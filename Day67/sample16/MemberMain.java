package sample16;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample15.MemberDAO;
import sample15.MemberDTO;

public class MemberMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MemberDAOFactory.class);

		MemberDAO memberDAO = (MemberDAO) context.getBean("getMemberDAO");

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

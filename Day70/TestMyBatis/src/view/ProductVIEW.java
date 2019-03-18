package view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ProductDAO;
import entity.Product;

public class ProductVIEW {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		StringBuilder sb = new StringBuilder();
		sb.append("========================선택\n");
		sb.append("1. 전체 출력 \n");
		sb.append("2. 추     가 \n");
		sb.append("3. 삭     제 \n");
		sb.append("4. 수     정 \n");
		sb.append("5. 종     료 \n");
		System.out.println(sb);
		System.out.print("input no :");
		int no = 0;
		
		try {
			no = sc.nextInt();
			if(no <=0  &&  no >=5  ) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}

		return no;
	}

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("view/applicationContext.xml");
		ProductDAO dao = (ProductDAO) factory.getBean("mydao");
		int no = 0;
		int price = 0;
		String item = null;
		Date regdate = new Date();
		
		//type이 getClass가 != Integer 
		Product pro = new Product();
		do {
			no = menu();
			switch (no) {
			case 1:
				System.out.println("전체 출력\n");
				List<Product> all = dao.getAll();
				for (Product r : all) {
					System.out.println(r);
				}
				break;
			case 2:
				System.out.println("가격을 입력하세요");
				price = sc.nextInt();
				System.out.println("아이템명을 입력하세요\n");
				try {
					item = sc.next();
				} catch (Exception e) {
					e.getMessage();
					System.out.println("큰따옴표를 입력하세요");
				} finally {

				}

				int year = 0, month = 0, day = 0;
				System.out.println("year :");
				try {
					year = sc.nextInt();
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요");
				}

				System.out.println("month :");
				try {
					month = sc.nextInt();
				} catch (Exception e) {
					System.out.println("숫자좀 입력하라고");
				}
				System.out.println("day :");
				try {
					day = sc.nextInt();
				} catch (Exception e) {
					System.out.println("숫자 입력안할래?");
				}
				pro.setItem(item);
				pro.setPrice(price);
				regdate = new Date(year, month, day);
				pro.setRegdate(regdate);
				int r = dao.getInsert(pro);
				if (r > 0) {
					System.out.println("입력성공했다");
				} else {
					System.out.println("안되었다.");
				}
				break;

			case 3:
				System.out.println("삭제 \n");
				System.out.println("몇 번째를 삭제하시겠어요?");
				int delete_no = sc.nextInt();
				int r1 = dao.getDelete(delete_no);
				if (r1 > 0) {
					System.out.println("삭제성공했다.");
				} else {
					System.out.println("안되었다.");
				}
				break;
			case 4:
				System.out.println("수정 \n");
				System.out.print("   수정할 번호는?   ");
				int update_no = sc.nextInt();
				System.out.print("   얼마로 바꿔볼까용?    ");
				int update_price = sc.nextInt();
				pro.setPrice(update_price);
				pro.setNo(update_no);
				int r2 = dao.getUpdate(pro);
				if (r2 > 0) {
					System.out.println("수정되었어!");
				} else {
					System.out.println("안되었어");
				}
				break;

			case 5:
				System.out.println("종료합니다");
				System.exit(0);
			default: 
				System.out.println("꺼져주세요");
				break;
			}
		} while (true);
	}
}

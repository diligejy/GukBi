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
		sb.append("========================����\n");
		sb.append("1. ��ü ��� \n");
		sb.append("2. ��     �� \n");
		sb.append("3. ��     �� \n");
		sb.append("4. ��     �� \n");
		sb.append("5. ��     �� \n");
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
		
		//type�� getClass�� != Integer 
		Product pro = new Product();
		do {
			no = menu();
			switch (no) {
			case 1:
				System.out.println("��ü ���\n");
				List<Product> all = dao.getAll();
				for (Product r : all) {
					System.out.println(r);
				}
				break;
			case 2:
				System.out.println("������ �Է��ϼ���");
				price = sc.nextInt();
				System.out.println("�����۸��� �Է��ϼ���\n");
				try {
					item = sc.next();
				} catch (Exception e) {
					e.getMessage();
					System.out.println("ū����ǥ�� �Է��ϼ���");
				} finally {

				}

				int year = 0, month = 0, day = 0;
				System.out.println("year :");
				try {
					year = sc.nextInt();
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��ϼ���");
				}

				System.out.println("month :");
				try {
					month = sc.nextInt();
				} catch (Exception e) {
					System.out.println("������ �Է��϶��");
				}
				System.out.println("day :");
				try {
					day = sc.nextInt();
				} catch (Exception e) {
					System.out.println("���� �Է¾��ҷ�?");
				}
				pro.setItem(item);
				pro.setPrice(price);
				regdate = new Date(year, month, day);
				pro.setRegdate(regdate);
				int r = dao.getInsert(pro);
				if (r > 0) {
					System.out.println("�Է¼����ߴ�");
				} else {
					System.out.println("�ȵǾ���.");
				}
				break;

			case 3:
				System.out.println("���� \n");
				System.out.println("�� ��°�� �����Ͻðھ��?");
				int delete_no = sc.nextInt();
				int r1 = dao.getDelete(delete_no);
				if (r1 > 0) {
					System.out.println("���������ߴ�.");
				} else {
					System.out.println("�ȵǾ���.");
				}
				break;
			case 4:
				System.out.println("���� \n");
				System.out.print("   ������ ��ȣ��?   ");
				int update_no = sc.nextInt();
				System.out.print("   �󸶷� �ٲ㺼���?    ");
				int update_price = sc.nextInt();
				pro.setPrice(update_price);
				pro.setNo(update_no);
				int r2 = dao.getUpdate(pro);
				if (r2 > 0) {
					System.out.println("�����Ǿ���!");
				} else {
					System.out.println("�ȵǾ���");
				}
				break;

			case 5:
				System.out.println("�����մϴ�");
				System.exit(0);
			default: 
				System.out.println("�����ּ���");
				break;
			}
		} while (true);
	}
}

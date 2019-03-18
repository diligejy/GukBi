package view;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ProductDAO;
import entity.Product;

public class ProductVIEW {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("view/applicationContext.xml");
		ProductDAO dao = (ProductDAO) factory.getBean("mydao");
		System.out.println("전체 출력");
		List<Product> all = dao.getAll();
		for(Product p : all) {
			System.out.println(p);
		}
		
	}
}

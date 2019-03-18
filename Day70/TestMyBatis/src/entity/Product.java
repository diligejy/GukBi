package entity;

import java.util.Date;

public class Product {
	private int no;
	private String item;
	private int price;
	private Date regdate;

	public Product() {
		super();
	}

	public Product(int no, String item, int price, Date regdate) {
		super();
		this.no = no;
		this.item = item;
		this.price = price;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", item=" + item + ", price=" + price + ", regdate=" + regdate + "]";
	}
	
}

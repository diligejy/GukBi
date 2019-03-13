package sample12;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Foo {
	private Bar bar;

	public void setNumber(int number) {
		System.out.println("setNumber :" + number);
	}

	public void setList(List<String> item) {
		System.out.println("List ȣ��");
		for (String r : item) {
			System.out.println(r);
		}
	}

	public void setArray(String[] item) {
		System.out.println("String[] ȣ��");
		for (String r : item) {
			System.out.println(r);
		}
	}

	public void setSet(Set<String> item) {
		System.out.println("set ȣ��");
		for (String r : item) {
			System.out.println(r);
		}
	}

	public void setMap(Map<String, String> item) {
		System.out.println("Map ȣ��");
		Set<String> keys = item.keySet();
		for (String key : keys) {
			System.out.println(key + "�� ��ȭ��ȣ  : " + item.get(key));
		}
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Bar Setter : " + bar);
	}

	public void setDate(Date date) { // has a ���谡 �ִ� ��, setter�� ����
		System.out.println("Date Setter : " + date);
	}

	public Foo() {
		System.out.println("�⺻ �������Դϴ�");
	}

	public void fooMethod() {
		bar.pr();
	}
}

package com.test;

public class Person01 implements Human {

	@Override
	public String sayName(String name) {
		return "���� �̸��� " + name + "�Դϴ� : " + getClass().getName();
	}

	@Override
	public String sayJob(String job) {
		System.out.println("���� " + job + "�Դϴ�.");
		return "���������̳׿� \n\n";

	}

}

package com.test;

public class Person03 implements Human {

	@Override
	public String sayName(String name) {
		return "나의 이름은 " + name + "입니다 : " + getClass().getName();
	}

	@Override
	public String sayJob(String job) {
		System.out.println("나는 " + job + "입니다.");
		return "멋진직업이네요 \n\n";

	}

}

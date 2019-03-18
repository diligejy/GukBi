package com.test;

public class MyAdvice {

	public void beforeSaying() {
		System.out.println("당신의 이름은 무엇입니까?");
	}

	public void afterSaying() {
		System.out.println("당신의 직업은 무엇입니까?");
	}
}

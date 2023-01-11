package com.seonuit.spring.ex.lifecycle.model;

public class Person {

	// 이름, 나이
	private String name;
	private int age;

	// getter setter (오른쪽마우스 - source에서)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //전역변수로?
		// 이 setName 메소드를 RestController에서 쓸 것
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		// 이 setAge 메소드를 RestController에서 쓸 것
	}
	
	
}

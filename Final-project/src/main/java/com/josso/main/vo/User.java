package com.josso.main.vo;

public class User {

	private static final long serialVersionUID = 1111L;
	private String name;
	private int age;
	
	public User() {}
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

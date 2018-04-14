package com.steven.bean;

public class HelloWorld {
	private String name;

	public HelloWorld() {

		System.out.println("Hello World,Constructor!");
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void hello() {
		System.out.println("Hello" + name);
	}

}

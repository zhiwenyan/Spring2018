package com.steven.beans.collections;

import java.util.Map;

import com.steven.bean.Car;

public class NewPerson {
	private String name;
	private int age;
	private Map<String, Car> cars;

	public NewPerson() {
		super();
	}

	public NewPerson(String name, int age, Map<String, Car> car) {
		super();
		this.name = name;
		this.age = age;
		this.cars = car;
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

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}

package com.steven.beans.collections;

import java.util.List;

import com.steven.bean.Car;

public class Person {
	private String name;
	private int age;
	private List<Car> cars;

	public Person() {
		super();
	}

	public Person(String name, int age, List<Car> car) {
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

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

	

}

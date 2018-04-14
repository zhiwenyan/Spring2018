package com.steven.bean.cycle;

public class Car {
	private String brand;
	public Car() {
		System.out.println("Car's Constructor...");
	}
	public void setBrand(String brand) {
		System.out.println("setBrand");
		this.brand = brand;
	}
	public void init() {
		System.out.println("init...");
	}
	public void destory() {
		System.out.println("destory...");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

	

}

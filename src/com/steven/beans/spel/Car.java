package com.steven.beans.spel;

public class Car {
	private String brand;
	private double price;
	//轮胎的周长
	private double tyrePerimeter;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}
	public double getTyrePerimeter() {
		return tyrePerimeter;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}

}

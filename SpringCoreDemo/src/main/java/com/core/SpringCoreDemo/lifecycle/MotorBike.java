package com.core.SpringCoreDemo.lifecycle;

public class MotorBike {
	
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setting name");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		System.out.println("setting price");
	}
	public MotorBike(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "MotorBike [name=" + name + ", price=" + price + "]";
	}
	public MotorBike() {
		super();
	}
	
	public void init() {
		System.out.println("this is init method");
	}

	public void destroy() {
		System.out.println("this is destroy method");
	}
}

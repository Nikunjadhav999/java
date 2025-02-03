package com.wipro.java.oops.polymorphism;
/*
 * @author Nikunj
 */

public class Car {
	//private properties
	private String brand;
	private String model;
	private float price;
	
	//getter for brand
	public String getBrand() {
		return brand;
	}
	
	//setter for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter for model
	public String getModel() {
		return model;
	}
	
	//setter for model
	public void setModel(String model) {
		this.model = model;
	}

	//getter for price
	public float getPrice() {
		return price;
	}
	
	//setter for price
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	//toString method for easy printing
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	//to print the details 
	public void showDetails()
	{
		System.out.println("Details pf the car:");
	}

}
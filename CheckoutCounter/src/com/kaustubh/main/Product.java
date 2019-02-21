package com.kaustubh.main;

public class Product {

	private String name;
	private double price;
	private String category;
	//private int salesTax;
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		}
	
	/*
	 * public Product(String name, double price, String category, int salesTax) {
	 * super(); this.name = name; this.price = price; this.category = category;
	 * this.setSalesTax(salesTax); }
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}

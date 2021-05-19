package com.model;

public class Product2 {
	
	private String name;
	private double price;
	private int identifier;
	private boolean isVatApplicable;
	public Product2(String name, double price, int identifier,
	        boolean isVatApplicable) {
	    super();
	    this.name = name;
	    this.price = price;
	    this.identifier = identifier;
	    this.isVatApplicable = isVatApplicable;
	}
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public double getPrice() {
	    return price;
	}
	public void setPrice(long price) {
	    this.price = price;
	}
	public int getIdentifier() {
	    return identifier;
	}
	public void setIdentifier(int identifier) {
	    this.identifier = identifier;
	}
	public boolean isVatApplicable() {
	    return isVatApplicable;
	}
	public void setVatApplicable(boolean isVatApplicable) {
	    this.isVatApplicable = isVatApplicable;
	}
}

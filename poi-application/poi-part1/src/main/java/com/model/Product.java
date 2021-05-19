package com.model;

public class Product {
	private long id;
    private String name;
    private double costPrice;
    private boolean vatApplicable;
    
    
	public Product(long id, String name, double costPrice, boolean vatApplicable) {
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.vatApplicable = vatApplicable;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public boolean isVatApplicable() {
		return vatApplicable;
	}
	public void setVatApplicable(boolean vatApplicable) {
		this.vatApplicable = vatApplicable;
	}
}

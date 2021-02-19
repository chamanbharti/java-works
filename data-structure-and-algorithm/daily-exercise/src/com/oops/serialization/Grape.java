package com.oops.serialization;

import java.io.Serializable;

class Grape implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private String grapeName;
    private int grapeNumber;
    //private int grapeCost;
    public Grape() {
    	System.out.println("Constructor");
    }
	public String getGrapeName() {
		return grapeName;
	}
	public void setGrapeName(String grapeName) {
		this.grapeName = grapeName;
	}
	public int getGrapeNumber() {
		return grapeNumber;
	}
	public void setGrapeNumber(int grapeNumber) {
		this.grapeNumber = grapeNumber;
	}
	/*public int getGrapeCost() {
		return grapeCost;
	}
	public void setGrapeCost(int grapeCost) {
		this.grapeCost = grapeCost;
	}*/
}
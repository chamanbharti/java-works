package com.comparable;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Fruit compareFruit) {
		//int compareQuantity = ((Fruit)compareFruit).getQuantity();
		
		//ascending order
		//return this.quantity - compareQuantity;
		//descending order
		//return compareQuantity - this.quantity;
		if(fruitName == compareFruit.fruitName){
			return 0;
		}
		else if(fruitName == compareFruit.fruitName){
			return 1;
		}
		else
			return -1;
		/*if(quantity == compareFruit.quantity)
			return 0;
			else if(quantity > compareFruit.quantity)
				return 1;
		else
			return -1;
		if(compareFruit.quantity == quantity)
			return 0;
		else if(compareFruit.quantity > quantity)
			return 1;
		else
			return -1;*/
		/*int q = ((Fruit)compareFruit).getQuantity();
		return q - this.getQuantity();*/
		
	}/*
	/*public static Comparator<Fruit>fruitNameSort = new Comparator<Fruit>() {
		
		@Override
		public int compare(Fruit fruit1, Fruit fruit2) {
			String name1 = fruit1.getFruitName();
			String name2 = fruit2.getFruitName();
			//ascending order
			//return name1.compareTo(name2);
			//descending order
			return name2.compareTo(name1);
		}
	};*/
	public static Comparator<Fruit>fruitNameSort = new Comparator<Fruit>() {
		
		@Override
		public int compare(Fruit o1, Fruit o2) {
			/*String name1 = o1.getFruitName();
			String name2 = o2.getFruitName();
			//ascending order
			return name1.compareTo(name2);*/
			int q1 = o1.getQuantity();
			int q2 = o2.getQuantity();
			return q1 - q2;
		}
	};

}

package spring5.di.setter_constructor;

public class Bike {
	String color;
	public Bike() {
		System.out.println("Bike() constructor created");
	}
	public Bike(String color) {
		this.color = color;
		System.out.println("Bike(String color) constructor created and color="+color);
	}
	
	public String getColor() {
		System.out.println("inside setColor(String color)");
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("setColor(String color) created");
	}
	
	public void showColor() {
		System.out.println("Your bike color is "+color);
	}
}

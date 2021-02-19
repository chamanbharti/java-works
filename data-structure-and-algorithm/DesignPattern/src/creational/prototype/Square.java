package creational.prototype;

public class Square extends Shape{
	
	public Square(){
		type = "Square";
	}
	public void draw(){
		System.out.println("Inside square::draw() method.");
	}

}

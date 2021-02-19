//package generic;
//
//import java.util.ArrayList;
//import java.util.List;
//
//abstract class Shape{
//	abstract void draw();
//}
//
//class Rectangle extends Shape{
//
//	@Override
//	void draw() {
//		System.out.println("drawing rectangle");
//	}
//	
//}
//class Circle extends Shape{  
//	void draw(){
//		System.out.println("drawing circle");
//	}  
//}
//
//
//public class WildCard {
//	//creating a method that accepts only child class of Shape 
//	public static void drawShape(List<? extends Shape>lists) {
//		for(Shape s:lists) {
//			s.draw();//calling method of shape class by child class instance
//		}
//	}
//	
//	public static void main(String[] args) {
//		List<Rectangle>list1 = new ArrayList<>();
//		list1.add(new Rectangle());
//		
//		List<Circle>list2 = new ArrayList<>();
//		list2.add(new Circle());
//		list2.add(new Circle());
//		
//		drawShape(list1);
//		drawShape(list2);
//	}
//}

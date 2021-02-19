//package spring5.di.setter_constructor;
//
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//@Component
//class Test {
//
//	private short val2;
//	private char val3;
//	private boolean val4;
//	private int val5;
//	private float val6;
//	private long val7;
//	private double val8;
//	
//	/*
//	 //setter injection
//	public byte getVal1() {
//		return val1;
//	}
//	public void setVal1(byte val1) {
//		this.val1 = val1;
//	}
//	public short getVal2() {
//		return val2;
//	}
//	public void setVal2(short val2) {
//		this.val2 = val2;
//	}
//	public char getVal3() {
//		return val3;
//	}
//	public void setVal3(char val3) {
//		this.val3 = val3;
//	}
//	public boolean isVal4() {
//		return val4;
//	}
//	public void setVal4(boolean val4) {
//		this.val4 = val4;
//	}
//	public int getVal5() {
//		return val5;
//	}
//	public void setVal5(int val5) {
//		this.val5 = val5;
//	}
//	public float getVal6() {
//		return val6;
//	}
//	public void setVal6(float val6) {
//		this.val6 = val6;
//	}
//	public long getVal7() {
//		return val7;
//	}
//	public void setVal7(long val7) {
//		this.val7 = val7;
//	}
//	public double getVal8() {
//		return val8;
//	}
//	public void setVal8(double val8) {
//		this.val8 = val8;
//	}
//	*/
//	
//	//constructor injection
//	
////	public Test(byte val1, short val2, char val3, boolean val4, int val5, float val6, long val7, double val8) {
////		super();
////		this.val1 = val1;
////		this.val2 = val2;
////		this.val3 = val3;
////		this.val4 = val4;
////		this.val5 = val5;
////		this.val6 = val6;
////		this.val7 = val7;
////		this.val8 = val8;
////	}
//	
//	
//}
//@Configuration
//class App{
//	@Bean
//	public Test testBean() {
//	    return new Test();
//	 }
//}
//public class SetterVsConstructor {
//
//	public static void main(String[] args) {
//		
//		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		Test object = context.getBean(Test.class);
//		System.out.println(object);
//		//Test [val1=0, val2=0, val3=, val4=false, val5=0, val6=0.0, val7=0, val8=0.0]
//		context.close();
//	}
//}

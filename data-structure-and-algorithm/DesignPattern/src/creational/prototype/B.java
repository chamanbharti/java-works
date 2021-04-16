package creational.prototype;

public class B implements Cloneable{
	int j;
	A a;
	public B(int j,A a){
		this.j = j;
		this.a = a;
	}
	//overriding clone method to implement deep copy
	protected Object clone() throws CloneNotSupportedException{
		
		//return super.clone();//for deep copy
		B b = (B) super.clone();
		b.a = (A)a.clone();
		return b;
	}

}

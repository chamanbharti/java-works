package creational.prototype;

public class A implements Cloneable{//for shallow copy
	int i;
	public A(int i){
		this.i = i;
	}
	//for shallow copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}

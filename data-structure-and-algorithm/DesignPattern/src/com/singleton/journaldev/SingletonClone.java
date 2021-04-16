package com.singleton.journaldev;

class SuperClass implements Cloneable{
	int i=10;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Singleton extends SuperClass{
	
	public static Singleton obj=new Singleton();
	
	private Singleton(){}
	
	public Object clone() throws CloneNotSupportedException{
		return obj;
	}
	/*public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}*/
}
public class SingletonClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton obj=Singleton.obj;
		Singleton obj2=Singleton.obj;
		Singleton obj3=(Singleton)obj.clone();
		
		System.out.println("obj hash value:"+obj.hashCode());
		System.out.println("obj2 hash value:"+obj2.hashCode());
		System.out.println("obj3 hash value:"+obj3.hashCode());
		
	}
}

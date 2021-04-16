package com.singleton;
/*class SingletonSuper implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
   }
}*/
public final class SingletonCloneTest{

	private static SingletonCloneTest instance = null;
	private SingletonCloneTest() {
		System.out.println("chaman bharti");
	}
	
	public static SingletonCloneTest getInstance() {
		if(instance == null) {
			instance = new SingletonCloneTest();
			return instance;
		}
		return instance;
	}
	//You can avoid cloning by giving already created object by clone method
		public Object clone()throws CloneNotSupportedException {
				//return instance;
				return getInstance();
			}
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		//Here forcibly throws the exception for preventing to be cloned
		throw new CloneNotSupportedException();
		//return super.clone();
	}*/
	public static void main(String args[]) throws CloneNotSupportedException {
		SingletonCloneTest test1 = SingletonCloneTest.getInstance();
		SingletonCloneTest test2 = (SingletonCloneTest)test1.clone();
		System.out.println(test1);
		System.out.println(test2);
		
		
	}
}

package design_pattern.creational.singleton;

import java.lang.reflect.Constructor;

enum EnumSingleton {
	INSTANCE;
	public static EnumSingleton getInstance(){
	 return INSTANCE;
  }
}
public class Singleton8 {
	public static void main(String[] args) {
		
		EnumSingleton obj1=EnumSingleton.getInstance();
		EnumSingleton obj2=null;
		try{
			Constructor[] constructors =EnumSingleton.class.getDeclaredConstructors();
			for(Constructor constructor:constructors){
				//below code destroy singleton pttern
				constructor.setAccessible(true);
				obj2=(EnumSingleton)constructor.newInstance();
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}

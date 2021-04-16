package design_pattern.creational.singleton;

class Moon {
	
	private static Moon obj;//lazy loading
	//private constructor to avoid client applications to use constructor
	private Moon(){}
	
	public static Moon getInstance(){
		if(obj == null){
			obj = new Moon();
		}
		return obj;
	}
}
public class Singleton2 {
	public static void main(String[] args) {
		Moon m1 = Moon.getInstance();
		Moon m2 = Moon.getInstance();
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
	
}

package passbyvalue_ref;

public class Example2 {
	
	int a=10;
	void change(Example2 obj){
		obj.a=obj.a+100;//changes will be in the instance variables only
	}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		
		System.out.println("Before change:"+obj.a);
		//call by value
		obj.change(obj);
		System.out.println("After change:"+obj.a);
	}

}

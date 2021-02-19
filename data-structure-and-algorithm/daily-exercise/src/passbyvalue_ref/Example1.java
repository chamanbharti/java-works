package passbyvalue_ref;

public class Example1 {
	
	int a=10;
	void change(int a){
		a=a+100;//changes will be in the local variables only
	}
	public static void main(String[] args) {
		Example1 obj=new Example1();
		
		System.out.println("Before change:"+obj.a);
		//call by value
		obj.change(20);
		System.out.println("After change:"+obj.a);
	}

}

package creational.prototype;

public class DeepCopy {
	public static void main(String[] args) {
		A a = new A(10);
		B b1 = new B(20,a);
		B b2 = null;
		try{
			//creating clone of b1 and assigning it to b2
			b2 = (B)b1.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Object is not clone-able");
		}	
		//printing value of b1.a.i
		System.out.println(a.i);//10
		System.out.println(b1.a.i);//10
		System.out.println(b2.a.i);//10
		
		//changing value of b2.a.i to 100
		
		b2.a.i = 100;
		//now, this change will not reflect in original object 'b1' except 'b2'
		System.out.println(a.i);//10
		System.out.println(b1.a.i);//10
		System.out.println(b2.a.i);//100
		
				
	}

}

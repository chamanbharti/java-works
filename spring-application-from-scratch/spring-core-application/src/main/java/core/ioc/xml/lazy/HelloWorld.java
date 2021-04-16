package core.ioc.xml.lazy;
/*
 //using class with setter
public class HelloWorld{

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("My message : "+message);
	}
}
*/

/*
//using is-a relationship with setter
public class HelloWorld implements Message{

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void getMessage() {
		System.out.println("My message : "+message);
	}
}
*/

//using is-a relationship with constructor
public class HelloWorld implements Message{

	private String message;
	
	public HelloWorld(String message) {
		this.message = message;
	}

	@Override
	public void getMessage() {
		System.out.println("My message2 : "+message);
	}
}

package core.ioc.xml.eager;

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

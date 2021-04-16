package creational.factoryMethod.part0;

public class Samsung implements Mobile{
	private int ramSize;
	private String processor;
	
	public Samsung(int ramSize) {
		this.ramSize = ramSize;
	}

	public Samsung(String processor) {
		this.processor = processor;
		this.ramSize=2;
	}
	
	

}

package creational.factoryMethod.part0;

public class IPhone implements Mobile{
	
	private int ramSize;
	private String processor;
	private String CPU;
	public IPhone(int ramSize, String processor, String CPU) {
		this.ramSize = ramSize;
		this.processor = processor;
		CPU = CPU;
	}
	

}

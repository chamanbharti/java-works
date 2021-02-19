package creational.factoryMethod.part2;

//Factory Method Pattern
abstract public class Plan {
	
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units){
		System.out.println(units*rate);
	}
	

}

package creational.abstractFactory.part1;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
		}

}

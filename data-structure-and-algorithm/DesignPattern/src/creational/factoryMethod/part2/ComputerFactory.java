package creational.factoryMethod.part2;

public class ComputerFactory {
	
	/*public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
		}*/
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
			if("PC".equalsIgnoreCase(type)) 
				return new PC(ram, hdd, cpu);
			else if("Server".equalsIgnoreCase(type)) 
				return new Server(ram,hdd, cpu);
			
			return null;
			}

}

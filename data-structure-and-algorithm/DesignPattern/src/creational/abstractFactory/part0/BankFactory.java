package creational.abstractFactory.part0;

public class BankFactory extends AbstractFactory{
	public Bank getBank(String bank){
		if(bank==null){
			return null;
		}
		if(bank.equalsIgnoreCase("HDFC")){
			return new HDFC();
		}else if(bank.equalsIgnoreCase("ICICI")){
			return new ICICI();
		}
		return null;
	}
	public Loan getLoan(String loan){
		return null;
	}

}

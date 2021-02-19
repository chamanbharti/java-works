package creational.abstractFactory.part0;

public class ICICI implements Bank{
	
	private String BNAME;
	
	public ICICI(){
		BNAME="ICICI BANK";
	}
	public String getBankName(){
		return BNAME;
	}

}

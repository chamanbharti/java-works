package creational.abstractFactory.part0;

public class LoanFactory extends AbstractFactory{
	public Bank getBank(String bank){
		return null;
	}
	public Loan getLoan(String loan){
		if(loan==null){
			return null;
		}
		if(loan.equalsIgnoreCase("Home")){
			return new HomeLoan();
		}
		if(loan.equalsIgnoreCase("Bussiness")){
			return new BussinessLoan();
		}
		if(loan.equalsIgnoreCase("Education")){
			return new EducationLoan();
		}
		return null;
	}

}

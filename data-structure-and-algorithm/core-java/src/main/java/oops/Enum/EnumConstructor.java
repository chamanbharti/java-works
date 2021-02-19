package oops.Enum;

public enum EnumConstructor {
	KF(100), KO(75), RC(90), FO;
	
//	   public static final Beer KF = new Beer();
//	   public static final Beer KO = new Beer(75);
	private EnumConstructor() {
		System.out.println("constructor");
		this.price=65;
	}
	int price;
	EnumConstructor(int price){
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public static void main(String[] args) {
//		EnumConstructor b = EnumConstructor.FO;
//		System.out.println(b);
		
		EnumConstructor[] b = EnumConstructor.values();
		for (EnumConstructor b1:b) {
			System.out.println(b1+":"+b1.getPrice());
		}
	}
}

package creational.factoryMethod.part0;

public class TestMobile {
	public static void main(String[] args) {
		
		//MobileFactory mobileFactory=new MobileFactory();
		//Mobile mobile=mobileFactory.createMobile(Mobile.SAMSUNG);
		Mobile mobile=MobileFactory.createMobile(Mobile.SAMSUNG);
		System.out.println(mobile);
	}

}

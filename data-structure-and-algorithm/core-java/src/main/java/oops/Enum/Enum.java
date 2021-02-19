package oops.Enum;

//enum outside class
//enum Beer{
//	KF, KO, RC, FO;
//}
/**
 * Above declaration internally converted into below code
 * final class Beer{
 *  public static final Beer KF = new Beer();
 *  public static final Beer KO = new Beer();
 *  public static final Beer RC = new Beer();
 *  public static final Beer FO = new Beer();
 * }
 * 
 * modifier for enum
 * 
 * public
 * <default>
 * final      ==> outer class modifier
 * abstract
 * strictfp
 *-------------------------------------
 *
 * private
 * protected
 * final      ==> inner class modifier
 * static
 * ----------------------------------------
 * 
 * public
 * <default>
 * strictfp      ==> outer enum modifier
 * ------------------------------------------
 * 
 * public
 * <default>
 * strictfp
 * private
 * protected
 * static      ==> inner enum modifier
 * 
 * 
 * switch
 * 
 * byte
 * short   ===> 1.4v allowed for switch case
 * char
 * int
 * ------------------------------------------------
 * long
 * double   ===> not allowed for switch case
 * float
 * boolean
 * ------------------------------------------------
 * 
 * Byte
 * Short   ===> 1.5v allowed for switch case
 * Character
 * Integer
 * enum
 * ------------------------------------------------
 * 
 * String   ===> 1.7v allowed for switch case
 * ------------------------------------------------
 * 
 * 
 * @author Chaman.Bharti
 * 
 */
public class Enum {

//	//enum inside class
	enum Beer{
		KF, KO, RC, FO;
	}
	public static void main(String[] args) {
		//enum inside class
//		enum Beer{
//			KF, KO, RC, FO;
//		} //CT
		//Beer b = Beer.KF;
		//System.out.println(b);//==>System.out.println(b.toString())
	
		//switch
//		Beer b = Beer.KO;
//		switch(b) {
//		case KF:
//			System.out.println("KF");
//			break;
//		case KO:
//			System.out.println("KO");
//			break;
//		case RC:
//			System.out.println("RC");
//			break;
//		case FO:
//			System.out.println("FO");
//			break;
//		}
		
//		Beer[] b= Beer.values();
//		for(Object obj:b) {
//			System.out.println(obj);
//		}
//		
//		Beer[] b1= Beer.values(); 
//		for(Beer obj:b1) {
//			System.out.println(obj.ordinal()+":"+obj);
//		}
		
		
//		System.out.println(Beer.FO.equals(Beer.RC));
//		System.out.println(Beer.KF==Beer.RC);
//		System.out.println(Beer.KF.hashCode()==Beer.RC.hashCode());
//		//System.out.println(Beer.KF>Beer.RC);//CT
//		System.out.println(Beer.KF.ordinal()>Beer.RC.ordinal());
	
		Color[] c = Color.values();
		for(Color c1:c) {
			c1.info();
		}
		
		
	}

}

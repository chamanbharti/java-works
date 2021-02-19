package java14.NPE;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
//		Person person = new Person();
//		System.out.println(person.name.firstName);
		
//		Person person = null;
//		System.out.println(person.name.firstName);
		
//		Person person = new Person();
//		System.out.println(person.getName().getFirstName());
		
//		Person person = new Person();
//		person.name.firstName = "Chaman";
		
		//Multidimensional array
		String[][][] data = new String[1][1][];
		data[0][0][0]="chaman";
	}
}

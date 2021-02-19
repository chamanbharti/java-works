package java8.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		
		//without using Optional
//		String[] str = new String[10];
//		String lowerCaseString = str[5].toLowerCase();
//		System.out.println(lowerCaseString);
		
		//using optional class
		//If Value is not Present
//		String[] str = new String[10];
//		Optional<String> checkNull = Optional.ofNullable(str[5]);
//		if(checkNull.isPresent()) {//check for value present or not
//			String lowercaseString = str[5].toLowerCase();
//			System.out.println(lowercaseString);
//		}else {
//			 System.out.println("string value is not present");  
//		}
//		
		
		//If Value is Present
//		String[] str = new String[10];
//		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index 
//		Optional<String> checkNull = Optional.ofNullable(str[5]);
//		if(checkNull.isPresent()) {//check for value present or not
//			String lowercaseString = str[5].toLowerCase();
//			System.out.println(lowercaseString);
//		}else {
//			 System.out.println("string value is not present");  
//		}
		
		//If Value is Present
//		String[] str = new String[10];
//		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index 
//		Optional<String> checkNull = Optional.ofNullable(str[5]);
//		checkNull.ifPresent(System.out::println);// printing value by using method reference 
//		System.out.println(checkNull.get());// printing value by using get method 
//		System.out.println(str[5].toLowerCase());
		

		//It returns a empty optional
//        // It returns an empty instance of Optional class  
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty);
        
        //It returns a non-empty optional
//		String[] str = new String[10];        
//        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
//        Optional<String> value = Optional.of(str[5]);
//        //If value is present, it returns an optional or else returns an empty optional
//        System.out.println("Filtered value:"+value.filter(s->s.equals("JAVA")));
//        System.out.println("Filtered value:"+value.filter(s->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException  
//		String[] str = new String[10];     
//		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
//		Optional<String> value = Optional.of(str[5]);
//        System.out.println("Getting value: "+value.get()); 
//        // It returns hashCode of the value  
//        System.out.println("Getting hashCode: "+value.hashCode()); 
//        // It returns true if value is present, otherwise false  
//        System.out.println("Is value present: "+value.isPresent());  
        
     // It returns non-empty Optional if value is present, otherwise returns an empty Optional  
		String[] str = new String[10];     
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
		Optional<String> value = Optional.of(str[5]);
        System.out.println("Nullable Optional: "+Optional.ofNullable(str[5]));  
        // It returns value if available, otherwise returns specified value,  
        System.out.println("orElse: "+value.orElse("Value is not present"));  
        System.out.println("orElse: "+value.orElse("Value is not present"));  
        value.ifPresent(System.out::println);   // printing value by using method reference
        
	}

}

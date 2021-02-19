package java8.optional;

import java.util.Optional;

//https://stackify.com/optional-java/
public class PracticalDemo0 {

	public static void main(String[] args) {
		
		/**
		 Java 8 has introduced a new class Optional in java.util package. 
		 It is used to represent a value is present or absent. 
		 The main advantage of this new construct is that No more too many null checks and NullPointerException. 
		 It avoids any runtime NullPointerExceptions and supports us in developing clean and neat Java APIs or Applications. 
		 Like Collections and arrays, it is also a Container to hold at most one value. 
		 Let us explore this new construct with some useful examples.

		Advantages of Java 8 Optional:
		
		Null checks are not required.
		No more NullPointerException at run-time.
		We can develop clean and neat APIs.
		No more Boiler plate code
		 */
		//Creating Optional Instances
//		Optional<Employee> emptyOpt = Optional.empty();
//		System.out.println(emptyOpt.get());//RE:java.util.NoSuchElementException: No value present
		
//		Employee employee = new Employee("Chaman", 30);
//		employee = null;
//		Optional<Employee> opt = Optional.of(employee);
//		System.out.println(opt.get());//RE:java.NullPointerException
		/**
		 As you can see, we’re not completely rid of the NullPointerException. 
		 For this reason, you should only use of() when you are sure the object is not null.

		If the object can be both null or not-null, then you should instead choose the ofNullable() method:
		 */
//		Optional<Employee> optNullableOf = Optional.ofNullable(employee);
//		System.out.println(optNullableOf.get());
//		String name = "Chaman";
//		Optional<String> opt = Optional.ofNullable(name);
//		System.out.println(opt.get());
		
//		Employee employee = new Employee("Chaman", 30);
//		employee=null;
		//Optional<Employee>opt = Optional.ofNullable(employee);
		//To avoid this exception, you can choose to first verify if a value is present or not:
		//System.out.println(opt.isPresent());
		//Employee result = Optional.ofNullable(employee).orElseThrow( ()-> new IllegalArgumentException());
		//System.out.println(result.getName());
		
		//Transforming Values
		//Optional values can be transformed in a number of ways; let’s start with map() and flatMap() methods.
//		String name = Optional.ofNullable(employee)
//				.map( u -> u.getName())
//				.orElse("Mamta");
//		System.out.println(name);
		
//		Employee employee = new Employee("Chaman", 30);
//		employee.setName("Mamta");
//		String position = Optional.ofNullable(employee)
//			      .flatMap(u -> u.getPosition()).orElse("default");
//		Employee employee = new Employee("Chaman", 30);
//		Optional<Employee> result = Optional.ofNullable(employee)
//			      .filter( u -> u.getName() != null && u.getName().contains("C"));
//		System.out.println(result.isPresent());
		
		// from mkyong
//		Optional<String> gender = Optional.of("MALE");
//        String answer1 = "Yes";
//        String answer2 = null;
//        System.out.println("Non-Empty Optional:" + gender);
//        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
//        System.out.println("Empty Optional: " + Optional.empty());
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
//        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
//        // java.lang.NullPointerException
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
		
		//Optional.map and flatMap
//		Optional<String> nonEmptyGender = Optional.of("male");
//        Optional<String> emptyGender = Optional.empty();

//        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
//        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

//        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
//        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
//        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
//        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
		
		//3. Optional.filter
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
	}
}

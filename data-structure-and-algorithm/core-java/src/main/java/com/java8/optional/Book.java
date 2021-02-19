package java8.optional;

import java.util.Optional;

public class Book {
	
	public static final String BOOK_STATUS = "UNKNOWN";
	
	//Avoid
	public String findStatusAvoid() {
		//fetch an optional prone to be empty
		Optional<String>status = Optional.empty();
		
		if(status.isPresent()) {
			return status.get();
		}else {
			return BOOK_STATUS;
		}
	}
	
	//Prefer
	public String findStatusPrefer() {
		//fetch an optional prone to be empty
		Optional<String>status = Optional.empty();
		return status.orElse(BOOK_STATUS);
	}

}

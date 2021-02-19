package spring5.di.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	//private Heart heart;

	// this is for constructor autowire in xml
//	public Human(Heart heart) {
//		this.heart = heart;
//	}
	
	//public Human() {}
	
	/**
		 How @Autowired works?
		 1. first it try to resolves with "byType".
		 2. If byType fails then it goes with "byName"
	 */
//	@Autowired // (by constructor)
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Human(Heart heart) called");
//	}
	//@Autowired // (by setter)
	//using @Qualifier
//	@Autowired
//	@Qualifier("octopusHeart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method called");
//	}
//	

	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
	public void startPumping() {
	if(heart != null) {
		heart.pump();
		System.out.println("name of animal is : "+heart.getNameOfAnimal()+" no of heart present is : "+heart.getNoOfHeart());
	}else {
		System.out.println("You are dead");
	}
	
  }
}

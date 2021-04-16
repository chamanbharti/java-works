package com.hashcode_equal;
/*
 * equals() method is used to determine the equality of two objects. 
 * To bring in little bit of Mathematics flavor lets see the properties of equality.
 * When we say equality, it should adhere by the following properties,

Reflexive: Always, a = a. In Java, a.equals(a) should always be true.
Symmetric: If a = b, then b = a. In Java, if a.equals(b) is true, then b.equals(a) should be true.
Transitive: If a = b and b = c, then a = c. In Java, if a.equals(b) and b.equals(c) is true, 
then a.equals(c) should be true.
Above three points are some theory and do not worry about it much.

For a primitive type, determining the equality is simple. We all know an int value of 10 is always equal to 10. 
But this equals() method is about equality of two objects. When we say object, it will have properties. 
To decide about equality those properties are considered. It is not necessary that all properties must be taken 
into account to determine the equality and with respect to the class definition and context it can be decided. 
Then the equals() method can be overridden.
n the above example did you notice we have overridden another method hashCode() along with equals()? There is an 
importance to it.
We must override hashCode() when we override equals(). Why hashCode should also be overridden when equals is 
overridden? Because, they both serve the same purpose but in different contexts.

hashCode() method is used in hashtables to determine the equality of  keys. If you want more details about hashCode,
their default implementation, buckets, different hashing techniques you should go through my earliest tutorial on 
Java Hashtable. I guarantee you will enjoy, just read it :-).

When an application is executed, the hashcode (an integer) returned for an object should be same till another 
execution of that application. Now coming to the important point which is the contract between hashCode and equals 
method,

if two objects are equal, that is obj1.equals(obj2) is true then, obj1.hashCode() and obj2.hashCode() must return 
same integer.
 * */
public class Tiger {
	private String color;
	private String stripePattern;
	private int height;
	
	public Tiger(String color, String stripePattern, int height) {
		//super();
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public void setStripePattern(String stripePattern) {
		this.stripePattern = stripePattern;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	//equals method
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj == null || obj.getClass() !=getClass()){
			result = false;
		}
		else{
				Tiger tiger = (Tiger)obj;
				if(this.color == tiger.getColor() && this.stripePattern == tiger.getStripePattern()){
					result = true;
				}
		}
		return result;
	}
	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}
	public static void main(String[] args) {
		Tiger bengaliTiger1 = new Tiger("Yellow", "Dense", 3);
		Tiger bengaliTiger2 = new Tiger("Yellow", "Dense", 2);
		Tiger siberianTiger = new Tiger("White", "Sparse", 4);
		System.out.println("bengaliTiger1 and bengaliTiger2: "+bengaliTiger1.equals(bengaliTiger2));
		System.out.println("bengaliTiger1 and siberianTiger: "+bengaliTiger1.equals(siberianTiger));
		System.out.println("bengaliTiger1 hashCode: "+bengaliTiger1.hashCode());
		System.out.println("bengaliTiger2 hashCode: "+bengaliTiger2.hashCode());
		System.out.println("siberianTiger hashCode: "+siberianTiger.hashCode());
	}

}
